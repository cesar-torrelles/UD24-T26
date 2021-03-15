package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Maquinas;

/**
 * 
 *
 */
public interface IMaquinasDAO extends JpaRepository<Maquinas, Integer>{
	
}
