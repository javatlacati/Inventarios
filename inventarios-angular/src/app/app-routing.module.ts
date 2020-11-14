import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LoginComponent} from "./components/login/login.component";
import {MenuComponent} from "./components/menu/menu.component";
import {NotFoundComponent} from "./components/notfound/not-found.component";
import {EmployeeRegistrationComponent} from "./components/employee-registration/employee-registration.component";
import {PrivatePageGuard} from "./private-page.guard";
import {OrderManagementComponent} from "./components/order-management/order-management.component";

const routes: Routes = [
  {
    path: '',
    redirectTo: '/login',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'menu',
    component: MenuComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'employee-registration',
    component: EmployeeRegistrationComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'order-management',
    component: OrderManagementComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: '**',
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
