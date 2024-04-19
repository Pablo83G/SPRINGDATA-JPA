package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Tematica;
import com.formacionjpa.ejerciciosjpa.services.TematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tematica") //http://localhost:8080/tematica
public class TematicaController {

    @Autowired
    TematicaService tematicaService;

    @PostMapping
    public Tematica addTematica(@RequestBody Tematica tematica){
        return tematicaService.addTematica(tematica);
    }

    @GetMapping
    public List<Tematica> getTematica(){
        return tematicaService.getTematica();
    }
}
