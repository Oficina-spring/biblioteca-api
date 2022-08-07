package com.minicurso.biblioteca.autor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    public Autor buscarPorId(Long id) {
        return autorRepository.findById(id).get();
    }

    public void deletar(Long id) {
        autorRepository.deleteById(id);
    }
}
