package es.http.service.service;

import java.util.List;

import es.http.service.dto.Asignado_A;

public interface IAsignadoService {

	//Metodos del CRUD
		public List<Asignado_A> listarAsignado(); //Listar All 
		
		public Asignado_A guardarAsignado(Asignado_A registroCurso);	//Guarda un RegistroCurso CREATE
		
		public Asignado_A asignadoXID(int id); //Leer datos de un RegistroCurso READ
		
		public Asignado_A actualizarAsignado(Asignado_A registroCurso); //Actualiza datos del RegistroCurso UPDATE
		
		public void eliminarAsignado(int id);// Elimina el RegistroCurso DELETE
	
}


