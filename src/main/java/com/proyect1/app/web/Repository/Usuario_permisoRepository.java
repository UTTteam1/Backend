package com.proyect1.app.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.app.web.Models.Usuario_permiso;

@Repository
public interface Usuario_permisoRepository extends JpaRepository<Usuario_permiso, String>{
	
}
