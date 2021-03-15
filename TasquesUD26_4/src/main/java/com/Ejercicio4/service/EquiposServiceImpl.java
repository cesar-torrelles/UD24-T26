package com.Ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejercicio4.dao.EquiposDAO;
import com.Ejercicio4.dto.Equipos;

@Service
public class EquiposServiceImpl implements EquiposService {
	
	@Autowired
	EquiposDAO EquiposDAO;

	@Override
	public List<Equipos> listarEquipos() {
		return EquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos Equipos) {
		return EquiposDAO.save(Equipos);
	}

	@Override
	public Equipos EquiposXID(int id) {
		return EquiposDAO.findById(id).get();
	}

	@Override
	public Equipos actualizarEquipos(Equipos Equipos) {
		return EquiposDAO.save(Equipos);
	}

	@Override
	public void eliminarEquipos(int id) {
		EquiposDAO.deleteById(id);
	}

}
