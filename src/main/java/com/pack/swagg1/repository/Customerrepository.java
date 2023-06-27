package com.pack.swagg1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.swagg1.model.Customer;
@Repository
public interface Customerrepository  extends JpaRepository<Customer,Integer>{

}
