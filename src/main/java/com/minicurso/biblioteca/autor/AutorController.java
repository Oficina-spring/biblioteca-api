package com.minicurso.biblioteca.autor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
@RequestMapping("autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping("/ola")
    public String olaMundo(){
        return "Olá Mundo";
    }

    @PostMapping("/salvar")
    public Autor salvar(@RequestBody Autor autor){
        return autorService.salvar(autor);
    }

    @GetMapping("/listar")
    public List<Autor> listar(){
        return autorService.listar();
    }

    @GetMapping("/buscarPorId/{id}")
    public Autor buscarPorId(@PathVariable Long id){
        return autorService.buscarPorId(id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        autorService.deletar(id);
    }


}
