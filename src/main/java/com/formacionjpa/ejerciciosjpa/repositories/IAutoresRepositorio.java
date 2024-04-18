package com.formacionjpa.ejerciciosjpa.repositories;

import com.formacionjpa.ejerciciosjpa.entities.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* es una interfaz o clase que define métodos para realizar operaciones de acceso a datos en la base de datos. Estos
métodos pueden incluir operaciones CRUD (crear, leer, actualizar, borrar) y consultas personalizadas.  */
@Repository
// Repository marca una clase como un repositorio
public interface IAutoresRepositorio extends JpaRepository<Autores, Long> {

}
