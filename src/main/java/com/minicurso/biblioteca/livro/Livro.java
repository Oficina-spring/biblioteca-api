package com.minicurso.biblioteca.livro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.minicurso.biblioteca.autor.Autor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Livro {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    private Autor autor;

    private String nomeAutor;

}
