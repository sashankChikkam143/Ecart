import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductRRComponent } from './product-rr.component';

describe('ProductRRComponent', () => {
  let component: ProductRRComponent;
  let fixture: ComponentFixture<ProductRRComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductRRComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductRRComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
