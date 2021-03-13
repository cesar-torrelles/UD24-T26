package es.http.service.service;

import java.util.List;

import es.http.service.dto.Cajeros;

public interface ICajerosService {

	//Metodos del CRUD
		public List<Cajeros> listarCajeros(); //Listar All 
		
		public Cajeros guardarCajeros(Cajeros Cajeros);	//Guarda un Cajeros CREATE
		
		public Cajeros CajerosXID(int id); //Leer datos de un Cajeros READ
		
		public Cajeros actualizarCajeros(Cajeros Cajeros); //Actualiza datos del Cajeros UPDATE
		
		public void eliminarCajeros(int id);// Elimina el Cajeros DELETE
	
}


