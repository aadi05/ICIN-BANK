import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserData } from './model/userData';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  readonly url = 'http://localhost:8084/';

  constructor(private http:HttpClient) {
   }

   public getAllUsers(){
    return this.http.get<any[]>(this.url+"user/all");
  }
}
