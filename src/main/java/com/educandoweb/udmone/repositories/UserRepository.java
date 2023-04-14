package com.educandoweb.udmone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.udmone.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
 
}
