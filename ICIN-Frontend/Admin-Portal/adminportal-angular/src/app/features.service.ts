import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FeaturesService {

  id : number
  readonly rootUrl = 'http://localhost:8084/user/';
  constructor(private http: HttpClient) { 
  
  }

  setFeatures(username,value){
    this.id=value
    console.log(this.id)
    return this.http.get(this.rootUrl + username + '/features/' + value);
  }
}
