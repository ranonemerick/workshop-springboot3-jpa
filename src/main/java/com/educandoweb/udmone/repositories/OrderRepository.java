package com.educandoweb.udmone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.udmone.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
