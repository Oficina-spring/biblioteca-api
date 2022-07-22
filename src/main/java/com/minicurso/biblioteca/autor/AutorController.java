package com.minicurso.biblioteca.autor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("autores")
public class AutorController {


    @GetMapping("/ola")
    public String olaMundo(){
        return "Olá Mundo";
    }


}
