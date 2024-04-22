package com.formacionjpa.ejerciciosjpa.repositories;

import com.formacionjpa.ejerciciosjpa.entities.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibrosRepositorio extends JpaRepository<Libros, Long> {

    //Query: imprimir por pantalla los libros cuya fecha de publicación sea mayor que 2001
    @Query("select l from libros l where l.anhoPublicacion > ?1")
    List<Libros> findByAnhoPublicacionAntesDe(String anhoPublicacion);





}
