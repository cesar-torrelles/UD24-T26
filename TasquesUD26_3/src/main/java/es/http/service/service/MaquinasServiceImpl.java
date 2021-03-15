package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IMaquinasDAO;
import es.http.service.dto.Maquinas;

@Service
public class MaquinasServiceImpl implements IMaquinasService {
	
	@Autowired
	IMaquinasDAO iMaquinasDAO;

	@Override
	public List<Maquinas> listarMaquinas() {
		return iMaquinasDAO.findAll();
	}

	@Override
	public Maquinas guardarMaquinas(Maquinas Maquinas) {
		return iMaquinasDAO.save(Maquinas);
	}

	@Override
	public Maquinas MaquinasXID(int id) {
		return iMaquinasDAO.findById(id).get();
	}

	@Override
	public Maquinas actualizarMaquinas(Maquinas Maquinas) {
		return iMaquinasDAO.save(Maquinas);
	}

	@Override
	public void eliminarMaquinas(int id) {
		iMaquinasDAO.deleteById(id);
	}

}
