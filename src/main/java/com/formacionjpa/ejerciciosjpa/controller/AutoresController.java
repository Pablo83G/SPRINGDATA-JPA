package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Autores;
import com.formacionjpa.ejerciciosjpa.services.AutoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")//http://localhost:8080/autores
// ("/autores") esto es un valor fijo, los variables se ponen entre corchetes{}
public class AutoresController {

    @Autowired
    private AutoresService autoresService;

    @PostMapping
    public Autores addAutores (@RequestBody Autores autores){
        return autoresService.addAutores(autores);
    }

    @GetMapping
    public List<Autores> getAutores(){
        return autoresService.getAutores();
    }


}
