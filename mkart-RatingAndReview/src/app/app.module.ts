import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductRRComponent } from './product-rr/product-rr.component';
import { SellerRRComponent } from './seller-rr/seller-rr.component';

import {HttpClientModule} from '@angular/common/http'
 
@NgModule({
  declarations: [
    AppComponent,
    ProductRRComponent,
    SellerRRComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
