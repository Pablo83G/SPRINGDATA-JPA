package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Editoriales;
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


    @GetMapping(path="/queries")
    //RequestParam indicar los datos de la consulta por parámetro en url (/queries?anhoPublicacion=2001)
    public List<Libros> getByAnhoPublicacionGreaterThan(@RequestParam Long anhoPublicacion){
        return  librosService.getByAnhoPublicacionGreaterThan(anhoPublicacion);
    }

    //EJERCICIO 6
    // Mostrar libros publicados en el año 2001
    @GetMapping(path="/ejercicio6.1")
    public List<Libros> getbyAnhoPublicacionEquals(@RequestParam Long anhoPublicacion){
        return  librosService.getByAnhoPublicacionEquals(anhoPublicacion);
    }

    // Mostrar el libro cuyo ISBN es el 16.
    @GetMapping(path = "/ejercicio6.2")
    public List<Libros> getByIsbnEquals(@RequestParam Long isbn){
        return librosService.getByIsbnEquals(isbn);
    }

    //Mostrar los libros de la editorial RBA --> id_editorial=3
    @GetMapping(path = "/ejercicio6.3")
    public List<Libros> getByEditoriales(@RequestParam Editoriales editoriales){
        return librosService.getByEditoriales(editoriales);
    }

    // Mostrar los libros de la editorial PLANETA publicados en 1986
    @GetMapping(path = "/ejercicio6.4")
    public List<Libros> getByEditorialesAndAnhoPublicacion(
            @RequestParam Editoriales editoriales, Long anhoPublicacion){
        return librosService.getByEditorialesAndAnhoPublicacion(editoriales, anhoPublicacion);
    }

}
