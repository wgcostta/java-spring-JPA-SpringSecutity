package com.spring.codeblogs.repository;

import com.spring.codeblogs.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
