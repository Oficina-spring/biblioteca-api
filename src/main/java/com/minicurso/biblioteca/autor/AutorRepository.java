package com.minicurso.biblioteca.autor;

import com.minicurso.biblioteca.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByNomeContaining(String nome);

    boolean existsByCpf(String cpf);

    boolean existsById(Long id);

}

