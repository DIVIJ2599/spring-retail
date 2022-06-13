package com.retail.service;

import com.retail.controller.ProductNotFound;
import com.retail.exception.CartItemNotFound;
import com.retail.models.Cart;
import com.retail.models.CartDTO;

public interface CartService {
    public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
    public Cart getCartProduct(String token);
    public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);

    public Cart clearCart(String token);
}
