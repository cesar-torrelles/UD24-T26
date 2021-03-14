package com.Ejercicio4.service;

import java.util.List;

import com.Ejercicio4.dto.Equipos;

public interface EquiposService {

	//Metodos del CRUD
		public List<Equipos> listarEquipos(); //Listar All 
		
		public Equipos guardarEquipos(Equipos Equipos);	//Guarda un Equipos CREATE
		
		public Equipos EquiposXID(int id); //Leer datos de un Equipos READ
		
		public Equipos actualizarEquipos(Equipos Equipos); //Actualiza datos del Equipos UPDATE
		
		public void eliminarEquipos(int id);// Elimina el Equipos DELETE
	
}


