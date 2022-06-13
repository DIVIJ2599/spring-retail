package com.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retail.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
