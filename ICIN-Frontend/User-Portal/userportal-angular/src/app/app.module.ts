import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'; 
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AuthService } from './auth.service';
import { LoginService } from './login.service';
import { RegisterService } from './register.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { ChequeBookRequestComponent } from './cheque-book-request/cheque-book-request.component';
import { TransactionHistoryComponent } from './transaction-history/transaction-history.component';
import { TransferBetweenAccountsComponent } from './transfer-between-accounts/transfer-between-accounts.component';
import { EditProfileComponent } from './edit-profile/edit-profile.component';
import { TransferHistoryComponent } from './transfer-history/transfer-history.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ChequeBookRequestComponent,
    TransactionHistoryComponent,
    TransferBetweenAccountsComponent,
    EditProfileComponent,
    TransferHistoryComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule, // required animations module
  ],
  providers: [RegisterService, LoginService, AuthService], //
  bootstrap: [AppComponent]
})
export class AppModule { }
