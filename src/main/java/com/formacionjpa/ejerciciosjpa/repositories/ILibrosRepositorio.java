package com.formacionjpa.ejerciciosjpa.repositories;

import com.formacionjpa.ejerciciosjpa.entities.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibrosRepositorio extends JpaRepository<Libros, Long> {

}
