import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProviderManagementComponent } from './provider-management.component';

describe('ProviderManagementComponent', () => {
  let component: ProviderManagementComponent;
  let fixture: ComponentFixture<ProviderManagementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProviderManagementComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProviderManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
