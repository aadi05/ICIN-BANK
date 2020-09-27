import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CheckbookRequest } from './model/checkbookRequest';


@Injectable({
  providedIn: 'root'
})
export class CheckbookService {

  //readonly rootUrl = 'localhost:<port>/user/{username}/chequebook/request/confirm';
  readonly rootUrl = 'http://localhost:8084/user/';
  //readonly dataUrl= 'localhost:<port>/chequebook/request/all';
  readonly dataUrl= 'http://localhost:8084/chequebook/request/all';
  private data:any=[]
constructor(private http: HttpClient) { }




confirmCheckbookService(account){
  return this.http.get(this.rootUrl + account + '/chequebook/request/confirm');
}


getRequestsData():Observable<CheckbookRequest[]> {
  return this.http.get<CheckbookRequest[]>(this.dataUrl);
}

}

