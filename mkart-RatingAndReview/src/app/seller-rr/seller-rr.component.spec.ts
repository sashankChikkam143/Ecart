import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SellerRRComponent } from './seller-rr.component';

describe('SellerRRComponent', () => {
  let component: SellerRRComponent;
  let fixture: ComponentFixture<SellerRRComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SellerRRComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SellerRRComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
