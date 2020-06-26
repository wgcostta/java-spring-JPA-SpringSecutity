package com.spring.codeblogs.service;

import com.spring.codeblogs.model.Post;
import com.spring.codeblogs.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//mostrar pro Spring que deve ser gerenciado por ele.
@Service
public class CodeblogService implements CodeblogServiceInterface {
    //Ponto de Injeção do Repository (CodeBlogRepository) que já tem herança extendendo com os metodos prontos do JPA
    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
