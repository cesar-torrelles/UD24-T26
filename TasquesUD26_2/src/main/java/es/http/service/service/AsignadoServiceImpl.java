package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IAsignadoDAO;
import es.http.service.dto.Asignado_A;

@Service
public class AsignadoServiceImpl implements IAsignadoService {
	
	@Autowired
	IAsignadoDAO iRegistroCursoDAO;

	@Override
	public List<Asignado_A> listarAsignado() {
		return iRegistroCursoDAO.findAll();
	}

	@Override
	public Asignado_A guardarAsignado(Asignado_A curso) {
		return iRegistroCursoDAO.save(curso);
	}

	@Override
	public Asignado_A asignadoXID(int id) {
		return iRegistroCursoDAO.findById(id).get();
	}

	@Override
	public Asignado_A actualizarAsignado(Asignado_A curso) {
		return iRegistroCursoDAO.save(curso);
	}

	@Override
	public void eliminarAsignado(int id) {
		iRegistroCursoDAO.deleteById(id);
	}

}
