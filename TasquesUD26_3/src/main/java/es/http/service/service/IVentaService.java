package es.http.service.service;

import java.util.List;

import es.http.service.dto.Venta;

public interface IVentaService {

	//Metodos del CRUD
		public List<Venta> listarVenta(); //Listar All 
		
		public Venta guardarVenta(Venta Ventas);	//Guarda un Ventas CREATE
		
		public Venta VentaXID(int id); //Leer datos de un Ventas READ
		
		public Venta actualizarVenta(Venta Ventas); //Actualiza datos del Ventas UPDATE
		
		public void eliminarVenta(int id);// Elimina el Ventas DELETE
	
}


