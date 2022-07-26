package com.minicurso.biblioteca.autor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.minicurso.biblioteca.livro.Livro;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "AUTOR")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Livro> livros;

}
