import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {LoginComponent} from "./components/login/login.component";
import {MenuComponent} from "./components/menu/menu.component";
import {NotFoundComponent} from "./components/notfound/not-found.component";
import {EmployeeRegistrationComponent} from "./components/employee-registration/employee-registration.component";
import {PrivatePageGuard} from "./private-page.guard";
import {OrderManagementComponent} from "./components/order-management/order-management.component";
import {InventoryComponent} from './components/inventory/inventory.component';
import {BillingManagementComponent} from './components/billing-management/billing-management.component';
import {ShoppingComponent} from './components/shopping/shopping.component';
import {ProviderManagementComponent} from './components/provider-management/provider-management.component';
import {AdminMenuComponent} from "./components/admin-menu/admin-menu.component";
import {AdminPageGuard} from "./admin-page.guard";

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
    path: 'admin-menu',
    component: AdminMenuComponent,
    canActivate: [AdminPageGuard],
  },
  {
    path: 'employee-registration',
    component: EmployeeRegistrationComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'billing-management',
    component: BillingManagementComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'inventory-management',
    component: InventoryComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'order-management',
    component: OrderManagementComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'provider-management',
    component: ProviderManagementComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: 'shopping',
    component: ShoppingComponent,
    canActivate: [PrivatePageGuard],
  },
  {
    path: '**',
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
