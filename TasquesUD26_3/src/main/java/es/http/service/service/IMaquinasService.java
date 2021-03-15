package es.http.service.service;

import java.util.List;

import es.http.service.dto.Maquinas;



public interface IMaquinasService {

	//Metodos del CRUD
		public List<Maquinas> listarMaquinas(); //Listar All 
		
		public Maquinas guardarMaquinas(Maquinas Maquinas);	//Guarda un Maquinas CREATE
		
		public Maquinas MaquinasXID(int id); //Leer datos de un Maquinas READ
		
		public Maquinas actualizarMaquinas(Maquinas Maquinas); //Actualiza datos del Maquinas UPDATE
		
		public void eliminarMaquinas(int id);// Elimina el Maquinas DELETE
	

}


