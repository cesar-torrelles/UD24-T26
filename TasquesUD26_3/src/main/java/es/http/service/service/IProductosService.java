package es.http.service.service;

import java.util.List;

import es.http.service.dto.Productos;



public interface IProductosService {

	//Metodos del CRUD
		public List<Productos> listarProductos(); //Listar All 
		
		public Productos guardarProductos(Productos Productos);	//Guarda un Productos CREATE
		
		public Productos ProductosXID(int id); //Leer datos de un Productos READ
		
		public Productos actualizarProductos(Productos Productos); //Actualiza datos del Productos UPDATE
		
		public void eliminarProductos(int id);// Elimina el Productos DELETE
	

}


