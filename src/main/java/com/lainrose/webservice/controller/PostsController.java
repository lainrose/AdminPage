package com.lainrose.webservice.controller;

import com.lainrose.webservice.model.Posts;
import com.lainrose.webservice.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    private PostsRepository postsRepository;

    @RequestMapping("/posts")
    public List<Posts> getProducts() {
        return postsRepository.findAll();
    }

    @RequestMapping("/posts/{id}")
    public Posts getProductById(@PathVariable("id") long id) {
        return postsRepository.findById(id).get();
    }
}