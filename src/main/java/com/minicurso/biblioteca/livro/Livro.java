package com.minicurso.biblioteca.livro;

import com.minicurso.biblioteca.autor.Autor;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Livro {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    private Autor autor;

    private String nomeAutor;

}
