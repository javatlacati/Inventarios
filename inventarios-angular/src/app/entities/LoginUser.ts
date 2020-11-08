export class LoginUser {
  userName: string;
  password: string;
  active: true;

  constructor(userName: string, password: string) {
    this.userName = userName;
    this.password = password;
  }
}
