package com.formacionjpa.ejerciciosjpa.repositories;

import com.formacionjpa.ejerciciosjpa.entities.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILibrosRepositorio extends JpaRepository<Libros, Long> {

    // CONSULTAS HQL

    //EJERCICIO 4
    //Query: imprimir por pantalla los libros cuya fecha de publicación sea mayor que 2001
   /*
    @Query("select l from libros l where l.anhoPublicacion > ?1")
    List<Libros> findByAnhoPublicacionDespuesDe(Long anhoPublicacion);
    */

    // NOTACIÓN BASADA EN EL NOMBRE DEL MÉTODO

    //EJERCICIO 5
    // Consultas con palabras clave admitidas dentro de los nombres de los métodos
    // GreaterThan como mayor que 2001
    List<Libros> findByAnhoPublicacionGreaterThan(Long anhoPublicacion);

    //EJERCICIO 6
    // Mostrar libros publicados en el año 2001
    List<Libros> findByAnhoPublicacionEquals(Long anhoPublicacion);




}
