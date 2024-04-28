package com.mkart.seller.SellerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO {
	private String SellerName;
	private String UserId;
	private String Review;
	private Integer Rating;
	

	public SellerDTO()
	{
		
	}
	
	public SellerDTO(String sellerName, String userId, String review, Integer rating) {
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
		return "SellerDTO [SellerName=" + SellerName + ", UserId=" + UserId + ", Review=" + Review + ", Rating="
				+ Rating + "]";
	}
	
	
	
	

}
