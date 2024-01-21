package com.dakr.service;

import java.util.List;

import com.dakr.exception.ProductException;
import com.dakr.model.Review;
import com.dakr.model.User;
import com.dakr.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
