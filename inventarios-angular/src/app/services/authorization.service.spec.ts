import { TestBed } from '@angular/core/testing';

import { AuthorizationService } from './authorization.service';
import {HttpClientModule} from "@angular/common/http";
import {AppRoutingModule} from "../app-routing.module";

describe('AuthorizationService', () => {
  let service: AuthorizationService;

  beforeEach(() => {
    TestBed.configureTestingModule({imports: [HttpClientModule]});
    service = TestBed.inject(AuthorizationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
