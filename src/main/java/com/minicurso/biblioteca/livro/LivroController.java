package com.minicurso.biblioteca.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @RequestMapping("/ola")
    public String olaMundo(){
        return "Olá Mundo";
    }

    @PostMapping("/salvar")
    public Livro salvar(@RequestBody Livro livro){
        return livroService.salvar(livro);
    }

    @GetMapping("/listar")
    public List<Livro> listar(){
        return livroService.listar();
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id){
        Livro livro =  livroService.buscarPorId(id);
        return livro != null ? ResponseEntity.ok(livro) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        livroService.deletar(id);
    }


}
