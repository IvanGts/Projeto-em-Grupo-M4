package com.valdisnei.valdisnei.Controller;

import com.valdisnei.valdisnei.Dto.UsuarioDto;
import com.valdisnei.valdisnei.Model.Usuario;
import com.valdisnei.valdisnei.service.CrudUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/usuario")
@RestController
public class UsuarioController {
  @Autowired
    private CrudUsuarioService crudUsuarioService;

    @PostMapping("/cadastro")
    public ResponseEntity criarUsuario(@RequestBody UsuarioDto usuarioDto){
        Usuario usuario = crudUsuarioService.criarUsuario(usuarioDto);
      return ResponseEntity.ok(usuario);
    }

    @GetMapping("/todos")
    public List<Usuario> pegarTodosUsuarios(){
     return crudUsuarioService.pegarTodosUsuarios();
    }

    @PutMapping("{id}")
    public void editarUsuario(@RequestBody UsuarioDto usuarioDto, @PathVariable int id){
        crudUsuarioService.editarUsuario(usuarioDto, id);
    }

    @DeleteMapping("{id}")
    public  void deleteUsuario(@PathVariable int id){
      crudUsuarioService.deleteUsuario(id);
    }

}
