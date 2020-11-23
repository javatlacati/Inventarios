import {Injectable} from '@angular/core';
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router} from '@angular/router';
import {Observable, of} from 'rxjs';
import {catchError, map} from 'rxjs/operators'
import {LoginUsersService} from "./services/login-users.service";
import {AuthorizationService} from "./services/authorization.service";

@Injectable({
  providedIn: 'root'
})
export class AdminPageGuard implements CanActivate {

  constructor(private loginService: LoginUsersService, private authorizationService: AuthorizationService, private router: Router) {
  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    const redirectUrl = route['_routerState']['url'];
    let logged = this.loginService.isLogged();
    if (!logged) {
      this.goToLogin(redirectUrl);
      return false;
    }


    return this.authorizationService.userHasPermission("AdminMenu").pipe(
      map(e => {
        if (e) {
          return true;
        } else {
          this.goToLogin(redirectUrl);
        }
      }), catchError((err) => {
        this.goToLogin(redirectUrl);
        return of(false);
      })
    );



    //this.loginService.logout();
  }

  private goToLogin(redirectUrl) {
    this.router.navigateByUrl(
      this.router.createUrlTree(
        ['/login'], {
          queryParams: {
            redirectUrl
          }
        }
      )
    );
  }
}
