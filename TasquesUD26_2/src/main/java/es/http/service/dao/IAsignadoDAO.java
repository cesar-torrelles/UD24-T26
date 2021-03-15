package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Asignado_A;

/**
 * @author Jose
 *
 */
public interface IAsignadoDAO extends JpaRepository<Asignado_A, Integer>{
	
}
