package com.springrobinson.inyeccionautowired.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Posteo {
    private Long id;
    private String titulo;
    private String autor;
}
