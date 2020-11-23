import { TestBed } from '@angular/core/testing';

import { LoginUsersService } from './login-users.service';
import {HttpClientModule} from "@angular/common/http";
import {AppRoutingModule} from "../app-routing.module";

describe('LoginUsersService', () => {
  let service: LoginUsersService;

  beforeEach(() => {
    TestBed.configureTestingModule({imports: [HttpClientModule]});
    service = TestBed.inject(LoginUsersService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
