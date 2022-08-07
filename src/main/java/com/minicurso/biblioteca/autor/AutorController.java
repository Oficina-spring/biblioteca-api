package com.minicurso.biblioteca.autor;

import com.minicurso.biblioteca.livro.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping("/ola")
    public String olaMundo(){
        return "Olá Mundo";
    }

    @PostMapping("/salvar")
    public ResponseEntity<Object> salvar(@RequestBody Autor autor){
        if(autorRepository.existsByCpf(autor.getCpf())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("CPF já cadastrado");
        }
        return autorService.salvar(autor);
    }

    @GetMapping("/listar")
    public List<Autor> listar(){
        return autorService.listar();
    }

    @GetMapping("/buscarPorId/{id}")
    public ResponseEntity<Autor> buscarPorId(@PathVariable Long id){
        Autor autor = autorService.buscarPorId(id);
        return autor != null ? ResponseEntity.ok(autor) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable Long id){
        if(!autorRepository.existsById(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Autor não encontrado");
        }
        autorService.deletar(id);
        return ResponseEntity.ok().body("Autor deletado com sucesso");
    }

    @GetMapping("/buscarPorNome/{nome}")
    public ResponseEntity<List<Autor>> buscarPorNome(@PathVariable String nome){
        List<Autor> autorList = autorService.findByNomeContaining(nome);
        return autorList != null ? ResponseEntity.ok(autorList) : ResponseEntity.notFound().build();
    }

    @GetMapping("/buscarLivrosPorAutor/{id}")
    public ResponseEntity<List<Livro>> buscarLivrosPorAutor(@PathVariable Long id){
        List<Livro> livroList = autorService.findLivrosByAutor(id);
        return livroList != null ? ResponseEntity.ok(livroList) : ResponseEntity.notFound().build();
    }


}
