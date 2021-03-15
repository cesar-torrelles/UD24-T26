package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proyecto;

public interface IProyectoService {

	//Metodos del CRUD
		public List<Proyecto> listarProyecto(); //Listar All 
		
		public Proyecto guardarProyecto(Proyecto estudiante);	//Guarda un Estudiante CREATE
		
		public Proyecto proyectoXID(int id); //Leer datos de un Estudiante READ
		
		public Proyecto actualizarProyecto(Proyecto estudiante); //Actualiza datos del estudiante UPDATE
		
		public void eliminarProyecto(int id);// Elimina el estudiante DELETE
	
}


