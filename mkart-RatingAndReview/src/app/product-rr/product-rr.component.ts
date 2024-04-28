import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductServiceService } from '../product-service.service';

@Component({
  selector: 'app-product-rr',
  templateUrl: './product-rr.component.html',
  styleUrls: ['./product-rr.component.css']
})
export class ProductRRComponent implements OnInit {

  form!:FormGroup;
  rating!:any;
  review!:any
  data:any
  value:any
  constructor(public service1:ProductServiceService, private fb:FormBuilder, private http:HttpClient) {
    this.form=this.fb.group({
      rating:['',Validators.required],
      review:['',[Validators.required]]
    })
   }

  ngOnInit(): void {
  }
  datafromUser(data:{review:string,rating:number,userId:string})
  {
    data.userId="jay@gmail.com"
    this.http.post("http://localhost:5400/Iphone/addReview",data).subscribe(
      (res)=>{console.log(res)}
    )
    this.service1.showDialogProduct=false;
  
  }
  

}
