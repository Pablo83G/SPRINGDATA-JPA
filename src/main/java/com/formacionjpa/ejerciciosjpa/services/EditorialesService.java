package com.formacionjpa.ejerciciosjpa.services;

import com.formacionjpa.ejerciciosjpa.entities.Editoriales;
import com.formacionjpa.ejerciciosjpa.entities.Tematica;
import com.formacionjpa.ejerciciosjpa.repositories.IEditorialesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialesService {

    // CONEXIÓN CON REPOSITORIO
    @Autowired
    private IEditorialesRepositorio iEditorialesRepositorio;

    // CONSTRUCTORES
    public EditorialesService() {}


    //MÉTODOS MANEJAR DATOS

    //Insert datos
    public Editoriales addEditoriales(Editoriales editoriales){
        return iEditorialesRepositorio.save(editoriales);
    }

    //Conseguir datos
    public List<Editoriales> getEditoriales(){
        return iEditorialesRepositorio.findAll();
    }
}
