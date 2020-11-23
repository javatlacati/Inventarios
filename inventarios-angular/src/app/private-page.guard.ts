import {Injectable} from '@angular/core';
import {CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router} from '@angular/router';
import {Observable} from 'rxjs';
import {LoginUsersService} from "./services/login-users.service";

@Injectable({
  providedIn: 'root'
})
export class PrivatePageGuard implements CanActivate {

  constructor(private loginService: LoginUsersService, private router: Router) {
  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    const redirectUrl = route['_routerState']['url'];
    let logged = this.loginService.isLogged();
    console.log("is user logged?:" + logged);
    if (logged) {
      return true;
    }
    this.router.navigateByUrl(
      this.router.createUrlTree(
        ['/login'], {
          queryParams: {
            redirectUrl
          }
        }
      )
    );
    //this.loginService.logout();
    return false;
  }

}
