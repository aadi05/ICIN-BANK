import { Injectable } from '@angular/core';
import { UserDisplay } from './_models/userdisplay';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url:string;

  constructor(private http:HttpClient) {
    this.url="http://localhost:8080"
   }
   public getUser(username):Observable<UserDisplay>{
    return this.http.get<UserDisplay>(this.url+"/home/"+username);
  }
}
