import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {LoginUser} from "../entities/LoginUser";
import {Observable} from "rxjs";

const USER_KEY = 'CURRENT_USER';

@Injectable({
  providedIn: 'root'
})
export class LoginUsersService {
  constructor(private http: HttpClient) {

  }

  login(user: LoginUser): Observable<Boolean> {
    let isUserLogged = this.http.post<Boolean>('http://localhost:8080/login', {user});
    if (isUserLogged) {
      localStorage.setItem(USER_KEY, user.userName);
    }
    return isUserLogged;
  }

  isLogged() {
    return localStorage.getItem(USER_KEY) != null;
  }

  logout() {
    localStorage.removeItem(USER_KEY);
  }
}
