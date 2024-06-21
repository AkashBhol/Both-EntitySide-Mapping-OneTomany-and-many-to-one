package com.akash.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.Entity.UserDo;

public interface UserRepo  extends JpaRepository<UserDo, Integer> {

}
