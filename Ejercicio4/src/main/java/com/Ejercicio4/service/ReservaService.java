package com.Ejercicio4.service;

import java.util.List;

import com.Ejercicio4.dto.Reserva;

public interface ReservaService {

	//Metodos del CRUD
		public List<Reserva> listarReserva(); //Listar All 
		
		public Reserva guardarReserva(Reserva Reserva);	//Guarda un Reserva CREATE
		
		public Reserva ReservaXID(int id); //Leer datos de un Reserva READ
		
		public Reserva actualizarReserva(Reserva Reserva); //Actualiza datos del Reserva UPDATE
		
		public void eliminarReserva(int id);// Elimina el Reserva DELETE
	
}


