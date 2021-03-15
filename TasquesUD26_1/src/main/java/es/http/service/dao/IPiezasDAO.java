package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Piezas;

/**
 * @author Jose
 *
 */
public interface IPiezasDAO extends JpaRepository<Piezas, Integer>{
	
}
