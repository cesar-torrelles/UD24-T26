package com.Ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejercicio4.dao.FacultadDAO;
import com.Ejercicio4.dto.Facultad;

@Service
public class FacultadServiceImpl implements FacultadService {
	
	@Autowired
	FacultadDAO FacultadDAO;

	@Override
	public List<Facultad> listarFacultad() {
		return FacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad Facultad) {
		return FacultadDAO.save(Facultad);
	}

	@Override
	public Facultad FacultadXID(int id) {
		return FacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad Facultad) {
		return FacultadDAO.save(Facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		FacultadDAO.deleteById(id);
	}

}