//package com.valdisnei.valdisnei.Controller;
//
//import com.valdisnei.valdisnei.Dto.BibliotecaDto;
//import com.valdisnei.valdisnei.Model.Biblioteca;
//import com.valdisnei.valdisnei.Model.Biblioteca;
//import com.valdisnei.valdisnei.Model.Midia;
//import com.valdisnei.valdisnei.service.CrudTelefoneService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RequestMapping("/biblioteca")
//@RestController
//public class BibliotecaController {
//    @Autowired
//    private CrudBibliotecaService crudBibliotecaService;
//    private CrudMidiaService crudMidiaService;
//    @PostMapping
//    public ResponseEntity criarBiblioteca(@RequestBody BibliotecaDto bibliotecaDto){
//        Biblioteca biblioteca = crudBibliotecaService.criarBiblioteca(bibliotecaDto);
//        return ResponseEntity.ok(biblioteca);
//    }
//    @GetMapping("/allmidias")
//    public List<Midia> pegarTodasAsMidias(){
//        return crudMidiaService.pegarTodasAsMidias();
//
//    }
//    @PutMapping("{id}")
//    public void editarBiblioteca(@RequestBody Biblioteca telefoneDto, @PathVariable int id){
//        crudTelefoneService.editarTelefone(telefoneDto, id);
//
//    }
//    @DeleteMapping("{id}")
//    public  void deleteTelefone(@PathVariable int id){
//        crudTelefoneService.deleteTelefone(id);
//    }
//}
