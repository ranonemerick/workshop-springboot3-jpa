package com.educandoweb.udmone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.udmone.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
 
}
