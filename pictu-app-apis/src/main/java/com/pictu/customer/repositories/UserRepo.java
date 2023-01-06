package com.pictu.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pictu.customer.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
