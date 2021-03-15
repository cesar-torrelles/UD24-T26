package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProyectoDAO;
import es.http.service.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {
	
	@Autowired
	IProyectoDAO iEstudianteDAO;

	@Override
	public List<Proyecto> listarProyecto() {
		return iEstudianteDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto curso) {
		return iEstudianteDAO.save(curso);
	}

	@Override
	public Proyecto proyectoXID(int id) {
		return iEstudianteDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto curso) {
		return iEstudianteDAO.save(curso);
	}

	@Override
	public void eliminarProyecto(int id) {
		iEstudianteDAO.deleteById(id);
	}

}
