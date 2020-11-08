import {Component, Inject} from "@angular/core";
import {LoginUsersService} from "../../services/LoginUsersService";
import {Router} from "@angular/router";
import {LoginUser} from "../../entities/LoginUser";

// @Inject
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  providers: [LoginUsersService]
})
export class LoginComponent {

  txtUser: string = "oscar";
  txtPswwd: string = "oscar";

  // constructor(private api: LoginUsersService) {
  // }

  loginAttempt() {
    // this.api.login(new LoginUser(this.txtUser, this.txtPswwd)).subscribe(
    //   response => {
    //     if (response) {
    //       this.router.navigateByUrl('/menu');
    //     }
    //   }, response => {
    //     alert(response.error.error);
    //   }
    // );
  }


}
