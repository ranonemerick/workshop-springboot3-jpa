package com.educandoweb.udmone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.udmone.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
