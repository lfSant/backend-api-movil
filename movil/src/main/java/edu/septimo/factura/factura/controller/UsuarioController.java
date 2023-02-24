package edu.septimo.factura.factura.controller;

import edu.septimo.factura.factura.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import edu.septimo.factura.factura.infraestructura.repositorio.UsuarioRepositorio;

import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //crud de usuario
    //generate a get method to get all users
    @GetMapping("/usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getUsuario()
    {
        return usuarioRepositorio.findAll();
    }

    //generate a post method to save a new user
    @PostMapping("/guardarusuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }

    //generate a put method to update a user
    @PutMapping("/actualizarusuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario updateUsuario(@RequestBody Usuario usuario)
    {
        return usuarioRepositorio.save(usuario);
    }

    //generate a delete method to delete a user
    @DeleteMapping("/eliminarusuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuario(@PathVariable int id)
    {
        usuarioRepositorio.deleteById(id);
    }


}
