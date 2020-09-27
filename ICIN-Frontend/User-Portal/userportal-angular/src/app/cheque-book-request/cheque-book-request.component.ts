import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RequestService } from '../request.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-cheque-book-request',
  templateUrl: './cheque-book-request.component.html',
  styleUrls: ['./cheque-book-request.component.css']
})
export class ChequeBookRequestComponent implements OnInit {

  requestingAccNo:number=+localStorage.getItem("savingAccNo");

  selectedValue: number;

  loading:boolean=false;

  pages = [
    { name: "20", value: 20 },
    { name: "50", value: 50 },
    { name: "75", value: 75 }
  ]

  filterSelected(value){
    this.selectedValue = value;
  }

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private requestService : RequestService,

  )
  {}

  ngOnInit(): void {

  }

  setOption() {
    this.loading = true;
    if(this.selectedValue==null){
      this.selectedValue=20;
    }
    try{
      this.requestService.insertRequest(this.requestingAccNo,+this.selectedValue).subscribe((res:any)=>{
        console.log(res);
        this.loading = false;
        if(res.status==true){
          Swal.fire(
            {
              icon: 'success',
              title: 'Chequebook request placed!',
              text:res.responseMessage
            }
          )
        }else{
          Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: res.responseMessage,
          })
        }
      });
    }
    catch{
      this.loading = false;
    }
    
  }


}
