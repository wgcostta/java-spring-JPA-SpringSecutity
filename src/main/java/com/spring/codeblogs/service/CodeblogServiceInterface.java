package com.spring.codeblogs.service;

import com.spring.codeblogs.model.Post;

import java.util.List;

public interface CodeblogServiceInterface {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
