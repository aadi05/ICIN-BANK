import { Component, OnInit } from '@angular/core';
import { AuthorizationService } from '../authorization.service'
import { AuthorizeUser } from '../model/authorizeUser';

@Component({
  selector: 'app-authorize-registration',
  templateUrl: './authorize-registration.component.html',
  styleUrls: ['./authorize-registration.component.css']
})
export class AuthorizeRegistrationComponent implements OnInit {

  authorizeusers:AuthorizeUser[];
  constructor(public authorizeService: AuthorizationService) { 
    
  }

  ngOnInit(){
    this.authorizeService.getRequestData().subscribe(res=>{
      console.log(res);
      this.authorizeusers = res});
  }

  authorizeAccount(username){
    this.authorizeService.authorizeAccount(username).subscribe(res=>this.ngOnInit());
  }

  rejectRequest(username){
    this.authorizeService.rejectRequest(username).subscribe(res=>this.ngOnInit());
  }


}
