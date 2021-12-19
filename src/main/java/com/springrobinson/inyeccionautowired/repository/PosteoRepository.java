package com.springrobinson.inyeccionautowired.repository;

import com.springrobinson.inyeccionautowired.model.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PosteoRepository {
    public List<Posteo> traerTodos(){

        List<Posteo> posteos = new ArrayList<>();
        posteos.add(new Posteo(1L,"5 lugares turisticos interesantes", "Danney Alvarez"));
        posteos.add(new Posteo(2L,"Una excusa poco convincente", "Javier Sanchez"));

        return posteos;

    }
}
