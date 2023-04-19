package com.educandoweb.udmone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.udmone.entities.Product;

public interface ProductRepository extends JpaRepository<Product ,Long>{
 
}
