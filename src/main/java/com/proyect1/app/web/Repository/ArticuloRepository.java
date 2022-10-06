package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.app.web.Models.Articulo;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, String> {

}
