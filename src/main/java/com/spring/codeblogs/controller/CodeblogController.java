package com.spring.codeblogs.controller;


import com.spring.codeblogs.model.Post;
import com.spring.codeblogs.service.CodeblogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeblogController {

    @Autowired
    CodeblogServiceInterface codeblogService;

    //Como a pagina renderizar vai pegar as informações
    @RequestMapping(value = "/posts",method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeblogService.findAll();
        mv.addObject("posts",posts);
        return mv;
    }

    @RequestMapping(value = "/posts/{id}",method = RequestMethod.GET)
    public ModelAndView getPostDetails(@PathVariable ("id") long id){
        ModelAndView mv = new ModelAndView("postDetails");
        Post post = codeblogService.findById(id);
        mv.addObject("post",post);
        return mv;
    }

}
