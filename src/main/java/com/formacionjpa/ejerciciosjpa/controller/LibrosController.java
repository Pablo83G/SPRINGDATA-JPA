package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Libros;
import com.formacionjpa.ejerciciosjpa.services.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros") //http://localhost:8080/libros
public class LibrosController {

    @Autowired
    LibrosService librosService;

    @PostMapping
    public Libros addLibros(Libros libros){
        return librosService.addLibros(libros);
    }


    @GetMapping
    public List<Libros> getLibros(){
        return librosService.getLibros();
    }

}
