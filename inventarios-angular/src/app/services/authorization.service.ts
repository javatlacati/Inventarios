import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {LoginUsersService} from "./login-users.service";

@Injectable({
  providedIn: 'root'
})
export class AuthorizationService {

  constructor(private http: HttpClient, private loginUsersService: LoginUsersService) {

  }

  userHasPermission(permissionName: string): Observable<Boolean> {
    let currentUser = this.loginUsersService.getCurrentUser();
    return this.http.post<Boolean>("http://localhost:8080/authorize", [currentUser, permissionName]);
  }
}
