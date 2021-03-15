package com.Ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejercicio4.dao.ReservaDAO;
import com.Ejercicio4.dto.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	ReservaDAO ReservaDAO;

	@Override
	public List<Reserva> listarReserva() {
		return ReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva Reserva) {
		return ReservaDAO.save(Reserva);
	}

	@Override
	public Reserva ReservaXID(int id) {
		return ReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva Reserva) {
		return ReservaDAO.save(Reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		ReservaDAO.deleteById(id);
	}

}