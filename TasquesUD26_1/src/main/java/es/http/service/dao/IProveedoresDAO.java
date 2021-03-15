package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Proveedores;

/**
 * @author Jose
 *
 */
public interface IProveedoresDAO extends JpaRepository<Proveedores, Integer>{
	
}
