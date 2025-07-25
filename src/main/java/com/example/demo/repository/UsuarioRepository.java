package com.example.demo.repository;

import com.example.demo.handler.BusinessException;
import com.example.demo.handler.CampoObrigatorioException;
import com.example.demo.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin() == null) throw new CampoObrigatorioException("login");
        if (usuario.getPassword() == null) throw new CampoObrigatorioException("password");

        if (usuario.getId() == null) {
            System.out.println("SAVE -- Recebendo o usuário na camada do repositório.");
        } else {
            System.out.println("UPDATE -- Recebendo o usuário na camada do repositório.");
        }
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST -- Listando todos os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("enzo", "password"));
        usuarios.add(new Usuario("joao", "masterpassword"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id %d para localizar um usuário", id));
        return new Usuario("enzo", "password");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s", username));
        return new Usuario("enzo", "password");
    }
}
