package com.minicurso.biblioteca.autor;

import com.minicurso.biblioteca.livro.Livro;
import com.minicurso.biblioteca.livro.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivroRepository livroRepository;

    public ResponseEntity<Object> salvar(Autor autor) {
        return ResponseEntity.ok(autorRepository.save(autor));
    }

    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    public Autor buscarPorId(Long id) {
        return autorRepository.findById(id).isPresent() ? autorRepository.findById(id).get() : null;
    }

    public void deletar(Long id) {
        autorRepository.deleteById(id);
    }

    public List<Autor> findByNomeContaining(String nome) {
        return autorRepository.findByNomeContaining(nome);
    }

    public List<Livro> findLivrosByAutor(Long id) {
        return livroRepository.findByAutorId(id);
    }

}
