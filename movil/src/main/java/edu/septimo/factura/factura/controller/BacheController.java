package edu.septimo.factura.factura.controller;

import edu.septimo.factura.factura.infraestructura.repositorio.BacheRepositorio;
import edu.septimo.factura.factura.modelo.Bache;
import org.aspectj.bridge.IMessageContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class BacheController {

    @Autowired
    BacheRepositorio bacheRepositorio;

    //crud de bache
    //generate a get method to get all baches
    @GetMapping("/baches")
    @ResponseStatus(HttpStatus.OK)
    public List<Bache> getUsuario()
    {
        return bacheRepositorio.findAll();
    }

    //generate a post method to save a new bache
    @PostMapping("/guardarbache")
    @ResponseStatus(HttpStatus.CREATED)
    public Bache saveBache(@RequestBody Bache bache){
        try{
            return bacheRepositorio.save(bache);
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }

    //generate a put method to update a bache
    @PutMapping("/actualizarbache")
    @ResponseStatus(HttpStatus.CREATED)
    public Bache updateBache(@RequestBody Bache bache)
    {
        return bacheRepositorio.save(bache);
    }

    //generate a delete method to delete a bache
    @DeleteMapping("/eliminarbache/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBache(@PathVariable int id)
    {
        bacheRepositorio.deleteById(id);
    }
}
