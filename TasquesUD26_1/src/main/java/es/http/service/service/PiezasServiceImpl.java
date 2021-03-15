package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IPiezasDAO;
import es.http.service.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService {
	
	@Autowired
	IPiezasDAO iCursoDAO;

	@Override
	public List<Piezas> listarPiezas() {
		return iCursoDAO.findAll();
	}

	@Override
	public Piezas guardarPiezas(Piezas curso) {
		return iCursoDAO.save(curso);
	}

	@Override
	public Piezas piezasXID(int id) {
		return iCursoDAO.findById(id).get();
	}

	@Override
	public Piezas actualizarPiezas(Piezas curso) {
		return iCursoDAO.save(curso);
	}

	@Override
	public void eliminarPiezas(int id) {
		iCursoDAO.deleteById(id);
	}

}
