import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillingManagementComponent } from './billing-management.component';

describe('BillingManagementComponent', () => {
  let component: BillingManagementComponent;
  let fixture: ComponentFixture<BillingManagementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BillingManagementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BillingManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
