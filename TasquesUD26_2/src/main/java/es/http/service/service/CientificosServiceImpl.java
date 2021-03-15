package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICientificosDAO;
import es.http.service.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService {
	
	@Autowired
	ICientificosDAO iCursoDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		return iCursoDAO.findAll();
	}

	@Override
	public Cientificos guardarCientificos(Cientificos curso) {
		return iCursoDAO.save(curso);
	}

	@Override
	public Cientificos cientificosXID(int id) {
		return iCursoDAO.findById(id).get();
	}

	@Override
	public Cientificos actualizarCientificos(Cientificos curso) {
		return iCursoDAO.save(curso);
	}

	@Override
	public void eliminarCientificos(int id) {
		iCursoDAO.deleteById(id);
	}

}
