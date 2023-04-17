package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.UsuarioDto;
import com.valdisnei.valdisnei.Model.Usuario;
import com.valdisnei.valdisnei.Service.CrudUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;


@RequestMapping("/usuario")
@RestController
@CrossOrigin
public class UsuarioController {
  @Autowired
    private CrudUsuarioService crudUsuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity criarUsuario(@RequestBody UsuarioDto usuarioDto) throws ParseException {
        Usuario usuario = crudUsuarioService.criarUsuario(usuarioDto);
      return ResponseEntity.ok(usuario);
    }

    @GetMapping("/todos")
    public List<Usuario> pegarTodosUsuarios(){
     return crudUsuarioService.pegarTodosUsuarios();
    }

    @PutMapping("{id}")
    public void editarUsuario(@RequestBody UsuarioDto usuarioDto, @PathVariable int id) throws ParseException {
        crudUsuarioService.editarUsuario(usuarioDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteUsuario(@PathVariable int id){
      crudUsuarioService.deleteUsuario(id);
    }

}
