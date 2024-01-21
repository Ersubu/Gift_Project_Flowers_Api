package com.dakr.service;

import java.util.List;

import com.dakr.exception.ProductException;
import com.dakr.model.Rating;
import com.dakr.model.User;
import com.dakr.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
