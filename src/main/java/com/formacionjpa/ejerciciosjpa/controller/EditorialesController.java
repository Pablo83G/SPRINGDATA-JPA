package com.formacionjpa.ejerciciosjpa.controller;

import com.formacionjpa.ejerciciosjpa.entities.Editoriales;
import com.formacionjpa.ejerciciosjpa.services.EditorialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales") //http://localhost:8080/editoriales
public class EditorialesController {

    @Autowired
    EditorialesService editorialesService;


    @PostMapping
    public Editoriales addEditoriales(@RequestBody Editoriales editoriales){
        return editorialesService.addEditoriales(editoriales);
    }

    @GetMapping
    public List<Editoriales> getEditoriales(){
        return editorialesService.getEditoriales();
    }

}
