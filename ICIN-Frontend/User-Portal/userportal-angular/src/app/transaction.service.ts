import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Transaction } from './_models/transaction'
import { SavingAccount } from './_models/savingaccount'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  private url:String;

  constructor(private http:HttpClient) {
    this.url="http://localhost:8080"
   }
   public getTransactions(accNo):Observable<Transaction[]>{
    return this.http.get<Transaction[]>(this.url+"/account/getHistory/"+accNo);
  }
  public getSavingAccount(username):Observable<SavingAccount>{
    return this.http.get<SavingAccount>(this.url+"/account/getsaving/"+username);
  }
  
}
