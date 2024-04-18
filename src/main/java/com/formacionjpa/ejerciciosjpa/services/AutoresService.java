package com.formacionjpa.ejerciciosjpa.services;

import com.formacionjpa.ejerciciosjpa.entities.Autores;
import com.formacionjpa.ejerciciosjpa.repositories.IAutoresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoresService {

    // CONEXIÓN CON REPOSITORIO
    @Autowired
    private IAutoresRepositorio iAutoresRepositorio;

    // CONSTRUCTORES
    public AutoresService() {}

    //MANEJAR MÉTODOS

    //Insert Datos
    public Autores addAutores (Autores autores){
        return iAutoresRepositorio.save(autores);
    }

    //Conseguir datos
    public List<Autores> getAutores(){
        return iAutoresRepositorio.findAll();
    }

}
