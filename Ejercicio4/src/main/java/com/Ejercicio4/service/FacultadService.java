package com.Ejercicio4.service;

import java.util.List;

import com.Ejercicio4.dto.Facultad;

public interface FacultadService {

	//Metodos del CRUD
		public List<Facultad> listarFacultad(); //Listar All 
		
		public Facultad guardarFacultad(Facultad Facultad);	//Guarda un Facultad CREATE
		
		public Facultad FacultadXID(int id); //Leer datos de un Facultad READ
		
		public Facultad actualizarFacultad(Facultad Facultad); //Actualiza datos del Facultad UPDATE
		
		public void eliminarFacultad(int id);// Elimina el Facultad DELETE
	
}


