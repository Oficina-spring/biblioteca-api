package com.minicurso.biblioteca.autor;

import com.minicurso.biblioteca.livro.Livro;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Autor {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    @OneToMany
    private List<Livro> livros;
}
