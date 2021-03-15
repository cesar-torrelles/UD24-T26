package es.http.service.service;

import java.util.List;

import es.http.service.dto.Piezas;



public interface IPiezasService {

	//Metodos del CRUD
		public List<Piezas> listarPiezas(); //Listar All 
		
		public Piezas guardarPiezas(Piezas curso);	//Guarda un Curso CREATE
		
		public Piezas piezasXID(int id); //Leer datos de un Curso READ
		
		public Piezas actualizarPiezas(Piezas curso); //Actualiza datos del Curso UPDATE
		
		public void eliminarPiezas(int id);// Elimina el Curso DELETE
	

}


