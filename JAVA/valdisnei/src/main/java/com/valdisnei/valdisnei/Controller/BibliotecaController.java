package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.BibliotecaDto;
import com.valdisnei.valdisnei.Model.Biblioteca;
import com.valdisnei.valdisnei.Service.CrudBibliotecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/biblioteca")
@RestController
public class BibliotecaController {
    @Autowired
    private CrudBibliotecaService crudBibliotecaService;

    @PostMapping("/cadastro")
    public ResponseEntity criarBiblioteca(@RequestBody BibliotecaDto bibliotecaDto){
        Biblioteca biblioteca = crudBibliotecaService.criarBiblioteca(bibliotecaDto);
        return ResponseEntity.ok(biblioteca);
    }

    @GetMapping("/todos")
    public List<Biblioteca> pegarTodosBiblioteca(){
        return crudBibliotecaService.pegarTodosBiblioteca();
    }

    @PutMapping("{id}")
    public void editarBiblioteca(@RequestBody BibliotecaDto bibliotecaDto, @PathVariable int id){
        crudBibliotecaService.editarBiblioteca(bibliotecaDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteBilme(@PathVariable int id){
        crudBibliotecaService.deleteBiblioteca(id);
    }

}