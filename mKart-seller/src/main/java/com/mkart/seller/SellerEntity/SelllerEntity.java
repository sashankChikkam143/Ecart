package com.mkart.seller.SellerEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sellerRR_tbl")
public class SelllerEntity {
	
	@Id
	private String UserId ;
	private String SellerName;
	private String Review;
	private Integer Rating;
	
	
	public SelllerEntity()
	{
		
	}
	
	

	public SelllerEntity(String sellerName, String userId, String review, Integer rating) {
		super();
		SellerName = sellerName;
		UserId = userId;
		Review = review;
		Rating = rating;
	}



	public String getSellerName() {
		return SellerName;
	}



	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}



	public String getUserId() {
		return UserId;
	}



	public void setUserId(String userId) {
		UserId = userId;
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
		return "SelllerEntity [SellerId=" + UserId + ", Review=" + Review + ", Rating=" + Rating + "]";
	}
	
	
	


}
