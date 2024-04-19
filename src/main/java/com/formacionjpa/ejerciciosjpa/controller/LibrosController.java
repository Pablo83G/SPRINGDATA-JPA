package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Libros;
import com.formacionjpa.ejerciciosjpa.services.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros") //http://localhost:8080/libros
public class LibrosController {

    @Autowired
    LibrosService librosService;

    @PostMapping
    public Libros addLibros(@RequestBody Libros libros){
        return librosService.addLibros(libros);
    }


    @GetMapping
    public List<Libros> getLibros(){
        return librosService.getLibros();
    }

}
