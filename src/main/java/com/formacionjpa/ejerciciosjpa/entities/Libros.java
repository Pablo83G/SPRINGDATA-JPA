package com.formacionjpa.ejerciciosjpa.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "libros")
@Table(name = "libros")
public class Libros {

    // ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "ISBM",
            updatable = false,
            nullable = false
    )
    private Long isbm;

    @Column(
            name = "titulo",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String titulo;

    @Column(
            name = "anho_publicacion",
            nullable = false,
            columnDefinition = "DATE"
    )
    private LocalDate anhoPublicacion;

    // CLAVE FORÁNEA
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autores autores;

    @ManyToOne
    @JoinColumn(name = "id_editorial")
    private Editoriales editoriales;

    @ManyToOne
    @JoinColumn(name = "id_tematica")
    private Tematica tematica;

    // CONSTRUCTORES
    public Libros() {}

    public Libros(String titulo, LocalDate anhoPublicacion) {
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
    }

    // GETTER AND SETTER
    public Long getIsbm() {
        return isbm;
    }

    public void setIsbm(Long isbm) {
        this.isbm = isbm;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(LocalDate anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }
}
