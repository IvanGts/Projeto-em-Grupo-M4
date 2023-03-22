package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.MidiaDto;
import com.valdisnei.valdisnei.Model.Midia;
import com.valdisnei.valdisnei.Service.CrudMidiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/midia")
@RestController
public class MidiaController {
    @Autowired
    private CrudMidiaService crudMidiaService;

    @PostMapping("/cadastro")
    public ResponseEntity criarMusica(@RequestBody MidiaDto midiaDto){
        Midia midia = crudMidiaService.criarMidia(midiaDto);
        return ResponseEntity.ok(midia);
    }

    @GetMapping("/todos")
    public List<Midia> pegarTodasMidias(){
        return crudMidiaService.pegarTodasMidias();
    }

    @PutMapping("{id}")
    public void editarMidia(@RequestBody MidiaDto midiaDto, @PathVariable int id){
        crudMidiaService.editarMidia(midiaDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteMidia(@PathVariable int id){
        crudMidiaService.deleteMidia(id);
    }

}
