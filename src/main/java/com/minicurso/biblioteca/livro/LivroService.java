package com.minicurso.biblioteca.livro;

import com.minicurso.biblioteca.autor.Autor;
import com.minicurso.biblioteca.autor.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private AutorService autorService;


    public Livro salvar(Livro livro) {
        Autor autor = autorService.buscarPorId(livro.getAutor().getId());
        livro.setNomeAutor(autor.getNome());
        livro.setAutor(autor);
        return livroRepository.save(livro);
    }

    public Livro buscarPorId(Long id) {
        return livroRepository.findById(id).get();
    }

    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    public void deletar(Long id) {
        livroRepository.deleteById(id);
    }


}
