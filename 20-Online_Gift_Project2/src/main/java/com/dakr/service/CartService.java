package com.dakr.service;

import com.dakr.exception.ProductException;
import com.dakr.model.Cart;
import com.dakr.model.User;
import com.dakr.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
