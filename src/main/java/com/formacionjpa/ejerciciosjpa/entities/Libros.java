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
            name = "ISBN",
            updatable = false,
            nullable = false
    )
    private Long isbn;

    @Column(
            name = "titulo",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String titulo;

    @Column(
            name = "anho_publicacion",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String anhoPublicacion;

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

    public Libros(String titulo, String anhoPublicacion) {
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
    }

    public Libros(Long isbn, String titulo, String anhoPublicacion, Autores autores, Editoriales editoriales, Tematica tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
        this.autores = autores;
        this.editoriales = editoriales;
        this.tematica = tematica;
    }

    // GETTER AND SETTER
    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(String anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public Autores getAutores() {
        return autores;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }

    public Editoriales getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(Editoriales editoriales) {
        this.editoriales = editoriales;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }
}
