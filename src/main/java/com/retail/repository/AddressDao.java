package com.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
