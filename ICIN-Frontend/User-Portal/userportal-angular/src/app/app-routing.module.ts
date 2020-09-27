import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


/**Componenets */
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { ChequeBookRequestComponent } from './cheque-book-request/cheque-book-request.component';
import { TransferBetweenAccountsComponent } from './transfer-between-accounts/transfer-between-accounts.component';
import { TransactionHistoryComponent } from './transaction-history/transaction-history.component';
import{ EditProfileComponent } from './edit-profile/edit-profile.component';
import {AuthGuard} from './auth.guard';
import { TransferHistoryComponent } from './transfer-history/transfer-history.component';


const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path:'transfer',component:TransferBetweenAccountsComponent,canActivate:[AuthGuard]},
  {path:'transactionHistory',component:TransactionHistoryComponent,canActivate:[AuthGuard]},
  {path:'chequebookRequest',component:ChequeBookRequestComponent,canActivate:[AuthGuard]},
  {path: 'home', component:HomeComponent,canActivate:[AuthGuard]},
  {path:'transferHistory',component:TransferHistoryComponent,canActivate:[AuthGuard]},
  {path:'editProfile',component:EditProfileComponent,canActivate:[AuthGuard]},
  { path: '**', redirectTo: '/login' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
