// UserController.java
package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    // Endpoint para obter todos os usuários
    @GetMapping
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    // Endpoint para obter um usuário pelo username
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    // Endpoint para excluir um usuário pelo ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    // Endpoint para criar um novo usuário
    @PostMapping
    public void postUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

    // Endpoint para atualizar um usuário existente
    @PutMapping
    public void putUser(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}

