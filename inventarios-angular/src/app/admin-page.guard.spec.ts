import { TestBed } from '@angular/core/testing';

import { AdminPageGuard } from './admin-page.guard';
import {HttpClientModule} from "@angular/common/http";
import {AppRoutingModule} from "./app-routing.module";

describe('AdminPageGuard', () => {
  let guard: AdminPageGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientModule, AppRoutingModule]
    });
    guard = TestBed.inject(AdminPageGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
