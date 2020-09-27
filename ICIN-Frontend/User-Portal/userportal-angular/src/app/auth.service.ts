import { Injectable } from '@angular/core';
import { Login } from './_models';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isAuthenticated=false;

  constructor(private router: Router) { }


  authenticate(isLoginError: boolean):boolean{
    if(isLoginError == false){
      this.isAuthenticated=true;
      return true;
    }
    else{
    this.isAuthenticated = false;
    return false;
  }
}
}
