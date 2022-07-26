package com.minicurso.biblioteca.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Livro buscarPorId(@PathVariable Long id){
        return livroService.buscarPorId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        livroService.deletar(id);
    }


}
