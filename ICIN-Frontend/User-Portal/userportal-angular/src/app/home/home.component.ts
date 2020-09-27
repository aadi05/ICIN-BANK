import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  username:String = localStorage.getItem("username");
  savingAcc:number;
  primaryAcc:number;
  savingBalanceLocal:number;
  primaryBalanceLocal:number;

  constructor(public authService:AuthService, public userService:UserService,private router: Router) {
    console.log(this.username);
   }

  ngOnInit(): void {

    this.userService.getUser(this.username).subscribe(res=>{
      this.savingAcc = res.savingsAccno;
      this.primaryAcc = res.primaryAccno;
      this.savingBalanceLocal = res.savingsBalance;
      this.primaryBalanceLocal = res.primaryBalance;
      localStorage.setItem("savingAccNo",this.savingAcc.toString());
    });

  }

  displayuserdetails() {
    this.userService.getUser(this.username).subscribe(res=>this.ngOnInit());
  }

}
