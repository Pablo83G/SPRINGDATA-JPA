package com.formacionjpa.ejerciciosjpa.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tematica")
@Table(name = "tematica")
public class Tematica {

    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "id_tematica",
            updatable = false,
            nullable = false
    )
    private Long idTematica;


    @Column(
            name = "categoria",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String categoria;

    // CLAVE FORÁNEA
    @OneToMany(mappedBy = "tematica")
    private List<Libros> libros;

    // CONSTRUCTORES
    public Tematica() {}

    public Tematica(String categoria) {
        this.categoria = categoria;
    }

    // GETTER AND SETTER
    public Long getIdTematica() {
        return idTematica;
    }

    public void setIdTematica(Long idTematica) {
        this.idTematica = idTematica;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
