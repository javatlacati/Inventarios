import {Component, Inject} from "@angular/core";
import {LoginUsersService} from "../../services/login-users.service";
import {Router} from "@angular/router";
import {LoginUser} from "../../entities/LoginUser";
import {AuthorizationService} from "../../services/authorization.service";

// @Inject
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  providers: [LoginUsersService]
})
export class LoginComponent {

  txtUser: string = "oscar";
  txtPswwd: string = "oscar";

  constructor(private usersService: LoginUsersService, private authorizationService: AuthorizationService, private router: Router) {
  }

  loginAttempt() {
    this.usersService.login(new LoginUser(this.txtUser, this.txtPswwd)).subscribe(
      response => {
        if (response) {
          let isAdminObservable = this.authorizationService.userHasPermission('AdminMenu');
          isAdminObservable.toPromise().then(
            (isAdmin) => {
              if (isAdmin) {
                this.router.navigateByUrl('/admin-menu');
              } else {
                this.router.navigateByUrl('/menu');
              }
            }
          );
        }
      }, response => {
        alert(response.error.error);
      }
    );
  }


}
