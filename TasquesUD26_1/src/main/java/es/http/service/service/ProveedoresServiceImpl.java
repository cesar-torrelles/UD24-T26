package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProveedoresDAO;
import es.http.service.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService {
	
	@Autowired
	IProveedoresDAO iEstudianteDAO;

	@Override
	public List<Proveedores> listarProveedores() {
		return iEstudianteDAO.findAll();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores curso) {
		return iEstudianteDAO.save(curso);
	}

	@Override
	public Proveedores proveedoresXID(int id) {
		return iEstudianteDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores curso) {
		return iEstudianteDAO.save(curso);
	}

	@Override
	public void eliminarProveedores(int id) {
		iEstudianteDAO.deleteById(id);
	}

}
