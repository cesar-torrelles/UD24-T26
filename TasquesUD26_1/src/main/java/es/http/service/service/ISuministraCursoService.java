package es.http.service.service;

import java.util.List;

import es.http.service.dto.Suministra;

public interface ISuministraCursoService {

	//Metodos del CRUD
		public List<Suministra> listarSuministra(); //Listar All 
		
		public Suministra guardarSuministra(Suministra registroCurso);	//Guarda un RegistroCurso CREATE
		
		public Suministra suministraXID(int id); //Leer datos de un RegistroCurso READ
		
		public Suministra actualizarSuministra(Suministra registroCurso); //Actualiza datos del RegistroCurso UPDATE
		
		public void eliminarSuministra(int id);// Elimina el RegistroCurso DELETE
	
}


