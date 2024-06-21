package com.akash.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.Entity.PostDo;

public interface PostRepo extends JpaRepository<PostDo, Integer>{

}
