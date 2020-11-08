import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './components/app/app.component';
import {LoginComponent} from "./components/login/login.component";
import {MenuComponent} from "./components/menu/menu.component";
import {FormsModule} from "@angular/forms";
import {CommonModule} from "@angular/common";
import {NotFoundComponent} from './components/notfound/not-found.component';
import {OrderManagementComponent} from './components/order-management/order-management.component';
import {CreditsComponent} from './components/credits/credits.component';
import {BillingManagementComponent} from './components/billing-management/billing-management.component';
import {EmployeeRegistrationComponent} from './components/employee-registration/employee-registration.component';
import {PrivatePageGuard} from "./private-page.guard";
import {LoginUsersService} from "./services/LoginUsersService";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MaterialmodModule} from "./shared/materialmod.module";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    NotFoundComponent,
    OrderManagementComponent,
    CreditsComponent,
    BillingManagementComponent,
    EmployeeRegistrationComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MaterialmodModule
  ],
  providers: [
    PrivatePageGuard,
    LoginUsersService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {

}
