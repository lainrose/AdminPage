package com.lainrose.webservice.repository;

import com.lainrose.webservice.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}