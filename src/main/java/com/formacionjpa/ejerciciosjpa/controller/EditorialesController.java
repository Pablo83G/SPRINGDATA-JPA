package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Editoriales;
import com.formacionjpa.ejerciciosjpa.services.EditorialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/editoriales") ////http://localhost:8080/editoriales
public class EditorialesController {

    @Autowired
    EditorialesService editorialesService;


    @PostMapping
    public Editoriales addEditoriales(Editoriales editoriales){
        return editorialesService.addEditoriales(editoriales);
    }

    @GetMapping
    public List<Editoriales> getEditoriales(){
        return editorialesService.getEditoriales();
    }

}
