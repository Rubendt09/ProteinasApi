package com.ruben.proteinapi.controller;

import com.ruben.proteinapi.model.Proteina;
import com.ruben.proteinapi.service.ProteinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProteinaController {

    @Autowired
    private ProteinaService proteinaService;

    @GetMapping
    public List<Proteina> getProteina(){
        return this.proteinaService.getProteina();
    }

    @PostMapping
    public Proteina saveProteina(@RequestBody Proteina proteina){
        return this.proteinaService.saveProteina(proteina);
    }

    @GetMapping(path="/{id}")
    public Optional<Proteina> getProteinaById(@PathVariable Integer id){
        return  this.proteinaService.getById(id);
    }

    @PutMapping(path="/{id}")
    public Proteina updateProteinaById(@RequestBody Proteina request, @PathVariable Integer id){
        return  this.proteinaService.updateById(request, id);
    }

    @DeleteMapping(path="/{id}")
    public String deleteProteinaById(@PathVariable("id") Integer id){
        boolean ok = this.proteinaService.deleteProtein(id);
        if (ok){
            return "User with id "+ id + " deleted";
        } else {return "Error to deleted";}
    }

    /*
    @GetMapping("/{id}")
    public Proteina getProteinaById(@PathVariable("id") Integer id) {
        return proteinaService.findById(id).orElse(null);
    }

    @PostMapping
    public Proteina createUser(@RequestBody Proteina proteina) {
        return proteinaService.save(proteina);
    }

    @PutMapping("/{id}")
    public Proteina updateProteina(@PathVariable("id") Integer id, @RequestBody Proteina proteina) {
        proteina.setId(id);
        return proteinaService.save(proteina);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        proteinaService.deleteById(id);
    }

     */
}
