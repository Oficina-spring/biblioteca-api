package com.minicurso.biblioteca.livro;

import com.minicurso.biblioteca.autor.Autor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Livro {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @ManyToOne
    private Autor autor;

    private String nomeAutor;

}
