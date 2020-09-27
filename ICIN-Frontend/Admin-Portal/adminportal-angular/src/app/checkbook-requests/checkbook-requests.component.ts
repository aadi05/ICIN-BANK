import { Component, OnInit } from '@angular/core';
import { CheckbookService } from '../checkbook.service'
import { CheckbookRequest } from '../model/checkbookRequest';
import { NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-checkbook-requests',
  templateUrl: './checkbook-requests.component.html',
  styleUrls: ['./checkbook-requests.component.css']
})
export class CheckbookRequestsComponent implements OnInit {

  checkbookrequests: CheckbookRequest[];
  term: string;
  
  
  constructor(public checkbookService: CheckbookService) {

  }

  ngOnInit() {
    this.checkbookService.getRequestsData().subscribe(res => {
      this.checkbookrequests = res
    });
  }

  getData() {

  }

  confirmRequest(account) {
    this.checkbookService.confirmCheckbookService(account).subscribe(res=>this.ngOnInit());
  }

}
