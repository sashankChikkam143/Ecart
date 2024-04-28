import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SellerServiceService {
  showDialog=false;
  Delivered=true;
  rejected=false;
  dateDelivered=true

  constructor(private http:HttpClient) { }

  getUser()
  {
    this.http.get("http://localhost:5300/sravan/getReview").subscribe((res)=>{
      console.log(res)
    })
  }
}
