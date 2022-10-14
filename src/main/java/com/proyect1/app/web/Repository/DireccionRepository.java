package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect1.app.web.Models.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, String>{

}
