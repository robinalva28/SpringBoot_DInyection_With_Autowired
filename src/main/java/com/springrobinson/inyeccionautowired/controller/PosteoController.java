package com.springrobinson.inyeccionautowired.controller;

import com.springrobinson.inyeccionautowired.model.Posteo;
import com.springrobinson.inyeccionautowired.repository.PosteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PosteoController {

    @Autowired
    private PosteoRepository repository;

    @GetMapping("/posts")
    public List<Posteo> traerTodos(){

        return repository.traerTodos();
    }
}
