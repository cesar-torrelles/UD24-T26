package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ISuministraDAO;
import es.http.service.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraCursoService {
	
	@Autowired
	ISuministraDAO iRegistroCursoDAO;

	@Override
	public List<Suministra> listarSuministra() {
		return iRegistroCursoDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra curso) {
		return iRegistroCursoDAO.save(curso);
	}

	@Override
	public Suministra suministraXID(int id) {
		return iRegistroCursoDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra curso) {
		return iRegistroCursoDAO.save(curso);
	}

	@Override
	public void eliminarSuministra(int id) {
		iRegistroCursoDAO.deleteById(id);
	}

}
