package com.gp6.springboot26.repository;

import com.gp6.springboot26.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
