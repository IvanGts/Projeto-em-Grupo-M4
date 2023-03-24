package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.TelefoneDto;
import com.valdisnei.valdisnei.Model.Telefone;
import com.valdisnei.valdisnei.Service.CrudTelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/telefone")
@RestController
public class TelefoneController {
    @Autowired
    private CrudTelefoneService crudTelefoneService;

    @PostMapping
    public ResponseEntity criarTelefone(@RequestBody TelefoneDto telefoneDto){
        Telefone telefone = crudTelefoneService.criarTelefone(telefoneDto);
        return ResponseEntity.ok(telefone);
    }
    @GetMapping("/todostelefones")
    public List<Telefone> pegarTodosTelefone(){
        return crudTelefoneService.pegarTodosTelefone();

    }
    @PutMapping("{id}")
    public void editarTelefone(@RequestBody TelefoneDto telefoneDto, @PathVariable int id){
        crudTelefoneService.editarTelefone(telefoneDto, id);

    }
    @DeleteMapping("{id}")
    public  void deleteTelefone(@PathVariable int id){
        crudTelefoneService.deleteTelefone(id);
    }

}