import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { SellerServiceService } from '../seller-service.service';

@Component({
  selector: 'app-seller-rr',
  templateUrl: './seller-rr.component.html',
  styleUrls: ['./seller-rr.component.css']
})
export class SellerRRComponent implements OnInit {

  form!:FormGroup;
  rating!:any;
  review!:any
  data:any
  value:any
  constructor(public service:SellerServiceService, private fb:FormBuilder,private http:HttpClient) {
    this.form=this.fb.group({
      rating:['',Validators.required],
      review:['',[Validators.required]]
    })
   }

   ngOnInit(): void {
  }
  datafromUser(data:{review:string,rating:number,userId:string})
{
  data.userId="Siddhu@gmail.com";
  
  console.log(data)
  this.http.post('http://localhost:5300/Raju/addReview',data).subscribe((res)=>{
    console.log(res)
    
  })
  this.service.showDialog=false;

}
}
