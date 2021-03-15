package com.Ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejercicio4.dao.InvestigadoresDAO;
import com.Ejercicio4.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements InvestigadoresService {
	
	@Autowired
	InvestigadoresDAO InvestigadoresDAO;

	@Override
	public List<Investigadores> listarInvestigadores() {
		return InvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores Investigadores) {
		return InvestigadoresDAO.save(Investigadores);
	}

	@Override
	public Investigadores InvestigadoresXID(int id) {
		return InvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigadores(Investigadores Investigadores) {
		return InvestigadoresDAO.save(Investigadores);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		InvestigadoresDAO.deleteById(id);
	}

}