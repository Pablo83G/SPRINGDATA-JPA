package com.formacionjpa.ejerciciosjpa.repositories;

import com.formacionjpa.ejerciciosjpa.entities.Editoriales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEditorialesRepositorio extends JpaRepository<Editoriales, Long> {

}
