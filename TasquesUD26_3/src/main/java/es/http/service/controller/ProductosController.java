package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Productos;
import es.http.service.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	ProductosServiceImpl ProductosServiceImpl;
	
	@GetMapping("/Productos")
	public List<Productos> listarCProductos(){
		return ProductosServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/Productos")
	public Productos salvarProductos(@RequestBody Productos Productos) {
		
		return ProductosServiceImpl.guardarProductos(Productos);
	}
	
	
	@GetMapping("/Productos/{id}")
	public Productos ProductosXID(@PathVariable(name="id") int id) {
		
		Productos Productos_xid= new Productos();
		
		Productos_xid=ProductosServiceImpl.ProductosXID(id);
		
		//System.out.println("Productos XID: "+Productos_xid);
		
		return Productos_xid;
	}
	
	@PutMapping("/Productos/{id}")
	public Productos actualizarProductos(@PathVariable(name="id")int id,@RequestBody Productos Productos) {
		
		Productos Productos_seleccionado= new Productos();
		Productos Productos_actualizado= new Productos();
		
		Productos_seleccionado= ProductosServiceImpl.ProductosXID(id);
		
		Productos_seleccionado.setNombre(Productos.getNombre());
		//Productos_seleccionado.setHoras(Productos.getHoras());
		
		Productos_actualizado = ProductosServiceImpl.actualizarProductos(Productos_seleccionado);
		
		//System.out.println("El Productos actualizado es: "+ Productos_actualizado);
		
		return Productos_actualizado;
	}
	
	@DeleteMapping("/Productos/{id}")
	public void eleiminarProductos(@PathVariable(name="id")int id) {
		ProductosServiceImpl.eliminarProductos(id);
	}
	
	
}
