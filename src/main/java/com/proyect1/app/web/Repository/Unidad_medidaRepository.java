package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect1.app.web.Models.Unidad_medida;

@Repository
public interface Unidad_medidaRepository extends JpaRepository<Unidad_medida, String>{

}
