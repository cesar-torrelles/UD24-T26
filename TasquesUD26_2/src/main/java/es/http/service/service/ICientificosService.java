package es.http.service.service;

import java.util.List;

import es.http.service.dto.Cientificos;



public interface ICientificosService {

	//Metodos del CRUD
		public List<Cientificos> listarCientificos(); //Listar All 
		
		public Cientificos guardarCientificos(Cientificos cientificos);	//Guarda un Curso CREATE
		
		public Cientificos cientificosXID(int id); //Leer datos de un Curso READ
		
		public Cientificos actualizarCientificos(Cientificos cientificos); //Actualiza datos del Curso UPDATE
		
		public void eliminarCientificos(int id);// Elimina el Curso DELETE
	

}


