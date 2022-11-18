package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.app.web.Models.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, String>{
	
}
