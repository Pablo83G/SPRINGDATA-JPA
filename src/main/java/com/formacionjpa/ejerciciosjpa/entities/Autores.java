package com.formacionjpa.ejerciciosjpa.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity(name = "autores")
@Table(name = "autores")
public class Autores {

    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
            name = "id_autor",
            updatable = false,
            nullable = false
    )
    private Long idAutor;

    @Column(
            name = "nombre",
            nullable = false,
            columnDefinition = "TEXT"
    )

    private String nombre;

    @Column(
            name = "apellidos",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String apellidos;

    @Column(
            name = "f_nacimiento",
            nullable = false,
            columnDefinition = "DATE"
    )
    private LocalDate fechaNacimiento;

    // CLAVE FORÁNEA
    @OneToMany(mappedBy = "autores")
    private List<Libros> libros;

    // CONSTRUCTORES
    public Autores() {
    }

    public Autores(String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    // GETTER AND SETTER
    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
