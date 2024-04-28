package com.mkart.product.ProductEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTRR_tbl")
public class ProductEntity {
	@Id
	private String UserId;
	private String ProductName;
	private String Review;
	private Integer Rating;
	
	
	public ProductEntity(String userId, String productName, String review, Integer rating) {
		super();
		UserId = userId;
		ProductName = productName;
		Review = review;
		Rating = rating;
	}
	public ProductEntity()
	{
		
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public Integer getRating() {
		return Rating;
	}
	public void setRating(Integer rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "ProductDTO [UserId=" + UserId + ", ProductName=" + ProductName + ", Review=" + Review + ", Rating="
				+ Rating + "]";
	}
	
	

}
