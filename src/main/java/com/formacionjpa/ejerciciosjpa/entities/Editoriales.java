package com.formacionjpa.ejerciciosjpa.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "editoriales")
@Table(name = "editoriales")
public class Editoriales {

    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id_editorial",
            updatable = false,
            nullable = false
    )
    private Long idEditorial;

    @Column(
            name = "nombre_editorial",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String nombreEditorial;

    @Column(
            name = "razon_social",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String razonSocial;

    // CLAVE FORÁNEA
    @OneToMany(mappedBy = "editoriales")
    private List<Libros> libros;

    // CONSTRUCTORES
    public Editoriales() {}

    public Editoriales(String nombreEditorial, String razonSocial) {
        this.nombreEditorial = nombreEditorial;
        this.razonSocial = razonSocial;
    }


    // GETTER AND SETTER
    public Long getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Long idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
