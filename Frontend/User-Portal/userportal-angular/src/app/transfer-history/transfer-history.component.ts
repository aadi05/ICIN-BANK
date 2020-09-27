import { Component, OnInit } from '@angular/core';
import {TransferHistory} from '../_models/transferhistory'
import { TransferhistoryService } from '../transferhistory.service';

@Component({
  selector: 'app-transfer-history',
  templateUrl: './transfer-history.component.html',
  styleUrls: ['./transfer-history.component.css']
})
export class TransferHistoryComponent implements OnInit {

  private accNo:number =+localStorage.getItem("savingAccNo");
  public transferList:Array<TransferHistory>;

  constructor(private transferService:TransferhistoryService) { }

  ngOnInit(): void {
    this.transferService.getTransferHistory(this.accNo).subscribe(res=>{
      this.transferList=res;
    });
  }

}
