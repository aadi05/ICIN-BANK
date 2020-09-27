import { Component, OnInit } from '@angular/core';
import { EnableService } from '../enable.service'
import { DisableService } from '../disable.service';
import { FeaturesService } from '../features.service';
import { UsersService } from '../users.service';
import { UserData } from '../model/userData';

@Component({
  selector: 'app-user-account',
  templateUrl: './user-account.component.html',
  styleUrls: ['./user-account.component.css']
})
export class UserAccountComponent implements OnInit {

  roles = [
    {name: " ", value:0},
    { name: "Deposit Access", value: 1 },
    { name: "Deposit + Withdraw Access", value: 2 },
    { name: "Deposit + Withdraw + Transfer Access", value: 3 }
  ]

  users: any[]
  //UserData[];
  constructor(public enableService: EnableService, public disableService: DisableService, public featuresService: FeaturesService, private service: UsersService) {

  }
  //selectedOption: string;
  //printedOption: number;
  selectedValue: number;

  ngOnInit() {
    this.service.getAllUsers().subscribe(res => {
      console.log(res)
     //console.log(res[0].featureStatus)
     res.forEach(element => {

       console.log(element.featureStatus)
      // console.log(this.roles[1].name)
       if(element.featureStatus == 1){
         element.featureStatus = this.roles[1].name
       }
       if (element.featureStatus == 2) {
        element.featureStatus = this.roles[2].name
       }
       if (element.featureStatus == 3) {
        element.featureStatus = this.roles[3].name
       }
     }); 
     this.users = res
     
    });
  }


  // print() {
  //   // this.printedOption = this.selectedOption;
  //   // console.log(this.selectedOption);
  // }

  filterSelected(selectedValue){
    this.selectedValue = selectedValue
    console.log('selected value= '+selectedValue);
  }

  enableLoginService(username) {
    console.log(username)
    this.enableService.enableLoginService(username).subscribe(res => this.ngOnInit());
    //this.enableService.enableLoginService();
  }

  disableLoginService(username) {
    this.disableService.disableLoginService(username).subscribe(res => this.ngOnInit());
    //this.disableService.disableLoginService();
  }

  setOption(username) {

    this.featuresService.setFeatures(username, this.selectedValue).subscribe(res => this.ngOnInit());
    //this.featuresService.setFeatures();
  }



}
