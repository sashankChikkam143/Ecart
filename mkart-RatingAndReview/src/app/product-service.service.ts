import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
  Delivered=false;
  rejected=true;
  dateDelivered=true

  constructor(private http:HttpClient) { }
  showDialogProduct=false;
  getUser()
  {
    this.http.get("http://localhost:5400/IPhone/fetchReview").subscribe((res)=>{
      console.log(res)
    })
  }
}
