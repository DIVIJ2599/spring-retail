package com.retail.service;

import com.retail.models.CartDTO;
import com.retail.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
