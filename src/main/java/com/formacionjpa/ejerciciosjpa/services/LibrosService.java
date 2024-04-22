package com.formacionjpa.ejerciciosjpa.services;

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

    public List<Libros> getbyAnhoPublicacionEquals (Long anhoPublicacion){
        return iLibrosRepositorio.findByAnhoPublicacionEquals(anhoPublicacion);
    }

}
