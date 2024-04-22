package com.formacionjpa.ejerciciosjpa.services;

import com.formacionjpa.ejerciciosjpa.entities.Editoriales;
import com.formacionjpa.ejerciciosjpa.entities.Libros;
import com.formacionjpa.ejerciciosjpa.repositories.ILibrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrosService {

    // CONEXIÓN CON EL REPOSITORIO
    @Autowired
    private ILibrosRepositorio iLibrosRepositorio;

    //CONSTRUCTORES
    public LibrosService() {}

    // MANEJAR MÉTODOS

    // Insert datos
    public Libros addLibros(Libros libros){
        return iLibrosRepositorio.save(libros);
    }

    //Conseguir datos
    public List<Libros> getLibros(){
        return iLibrosRepositorio.findAll();
    }

    //QUERIES
   /* public List<Libros> getByAnhoPublicacionDespuesDe(Long anhoPublicacion){
        return iLibrosRepositorio.findByAnhoPublicacionGreaterThan(anhoPublicacion);
    }*/

    public List<Libros> getByAnhoPublicacionGreaterThan(Long anhoPublicacion){
        return iLibrosRepositorio.findByAnhoPublicacionGreaterThan(anhoPublicacion);
    }

    //EJERCICIO 6
    // Mostrar libros publicados en el año 2001
    public List<Libros> getByAnhoPublicacionEquals(Long anhoPublicacion){
        return iLibrosRepositorio.findByAnhoPublicacionEquals(anhoPublicacion);
    }

    // Mostrar el libro cuyo ISBN es el 16.
    public List<Libros> getByIsbnEquals(Long isbn){
        return iLibrosRepositorio.findByIsbnEquals(isbn);
    }

    //Mostrar los libros de la editorial RBA.
    public List<Libros> getByEditoriales(Editoriales editoriales){
        return iLibrosRepositorio.findByEditoriales(editoriales);
    }

    // Mostrar los libros de la editorial PLANETA publicados en 1986
    public List<Libros> getByEditorialesAndAnhoPublicacion(Editoriales editoriales, Long anhoPublicacion){
        return iLibrosRepositorio.findByEditorialesAndAnhoPublicacion(editoriales, anhoPublicacion);
    }
}
