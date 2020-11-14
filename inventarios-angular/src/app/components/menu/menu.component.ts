import {Component} from "@angular/core";
import {LoginUsersService} from "../../services/LoginUsersService";
import {Router} from "@angular/router";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html'
})
export class MenuComponent {

  constructor(private loginService: LoginUsersService, private router: Router) {
  }

  logout(): void {
    this.loginService.logout();
    this.router.navigateByUrl(
      this.router.createUrlTree(
        ['/login']
      )
    );
  }
}
