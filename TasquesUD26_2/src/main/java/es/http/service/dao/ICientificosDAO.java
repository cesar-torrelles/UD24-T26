package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Cientificos;

/**
 * @author Jose
 *
 */
public interface ICientificosDAO extends JpaRepository<Cientificos, Integer>{
	
}
