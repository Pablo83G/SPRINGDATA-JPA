package com.formacionjpa.ejerciciosjpa.services;

import com.formacionjpa.ejerciciosjpa.entities.Tematica;
import com.formacionjpa.ejerciciosjpa.repositories.ITematicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TematicaService {

    // CONEXIÓN CON REPOSITORIO
    @Autowired
    private ITematicaRepositorio iTematicaRepositorio;

    // CONSTRUCTORES
    public TematicaService() {}

    //MÉTODOS MANEJAR DATOS

    //Insert datos
    public Tematica addTematica(Tematica tematica){
        return iTematicaRepositorio.save(tematica);
    }

    //Conseguir datos
    public List<Tematica> getTematica(){
        return iTematicaRepositorio.findAll();
    }



}
