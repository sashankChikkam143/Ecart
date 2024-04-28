import { Component } from '@angular/core';
import { ProductServiceService } from './product-service.service';
import { SellerServiceService } from './seller-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'mkart-RatingAndReview';
  constructor(public service:SellerServiceService ,public service1:ProductServiceService){}
  onverify()
  {
    if(this.service.dateDelivered==true  && this.service.Delivered==true || this.service.rejected==true)
    {
      this.service.showDialog=true;
    }
  }
  onverify1()
  {
    if(this.service1.dateDelivered==true  && this.service1.Delivered==true || this.service1.rejected==true)
    {
        this.service1.showDialogProduct=true
    }
  }
}
