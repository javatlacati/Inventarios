import {Component, OnInit} from '@angular/core';
import {LoginUsersService} from "../../services/login-users.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin-menu',
  templateUrl: './admin-menu.component.html',
  styleUrls: ['./admin-menu.component.sass']
})
export class AdminMenuComponent {

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
