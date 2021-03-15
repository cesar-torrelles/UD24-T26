package es.http.service.service;

import java.util.List;

import es.http.service.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
		public List<Proveedores> listarProveedores(); //Listar All 
		
		public Proveedores guardarProveedores(Proveedores estudiante);	//Guarda un Estudiante CREATE
		
		public Proveedores proveedoresXID(int id); //Leer datos de un Estudiante READ
		
		public Proveedores actualizarProveedores(Proveedores estudiante); //Actualiza datos del estudiante UPDATE
		
		public void eliminarProveedores(int id);// Elimina el estudiante DELETE
	
}


