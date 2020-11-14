import {TestBed} from '@angular/core/testing';

import {PrivatePageGuard} from './private-page.guard';
import {HttpClientModule} from "@angular/common/http";
import {AppRoutingModule} from "./app-routing.module";

describe('PrivatePageGuard', () => {
  let guard: PrivatePageGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientModule, AppRoutingModule]
    });
    guard = TestBed.inject(PrivatePageGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
