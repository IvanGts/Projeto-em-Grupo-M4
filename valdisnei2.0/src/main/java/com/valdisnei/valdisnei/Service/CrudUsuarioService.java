package com.valdisnei.valdisnei.Service;

import com.valdisnei.valdisnei.Bo.UsuarioBo;
import com.valdisnei.valdisnei.Dto.UsuarioDto;
import com.valdisnei.valdisnei.Model.Usuario;
import com.valdisnei.valdisnei.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CrudUsuarioService { // dependencia de classes CrudService
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioBo usuarioBo;
    public List<Usuario> pegarTodosUsuarios(){
       return usuarioRepository.findAll();

    }
    public void editarUsuario(UsuarioDto usuarioDto, int id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        Usuario usuario1 = usuario.orElseThrow();
        usuarioBo.parseToEntity(usuarioDto, usuario1);
        usuarioRepository.save(usuario1);
    }

    public Usuario criarUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = usuarioBo.parseToEntity(usuarioDto,null);
        usuarioRepository.save(usuario);
        return usuario;
    }

    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);
    }
}
