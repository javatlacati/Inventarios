export class LoginUser {
  userName: string;
  password: string;
  active: boolean;

  constructor(userName: string, password: string) {
    this.userName = userName;
    this.password = password;
    this.active = true;
  }
}
