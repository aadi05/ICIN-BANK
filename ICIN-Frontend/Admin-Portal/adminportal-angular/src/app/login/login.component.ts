import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {AuthenticationService} from '../service/authentication/authentication.service';
import { LoginData } from '../model/loginData';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private authenticationService : AuthenticationService) { }
  submitted=false;
  ngOnInit(): void {
  }

  

  onSubmit(loginForm :NgForm)
{
  this.submitted=true;
 const Logindata = new LoginData(loginForm.value.inputUserName,loginForm.value.password);
 this.authenticationService.authenticate(Logindata);
}

}
