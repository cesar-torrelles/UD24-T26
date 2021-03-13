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

import es.http.service.dto.Venta;
import es.http.service.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	VentaServiceImpl VentaServiceImpl;
	
	@GetMapping("/Venta")
	public List<Venta> listarVenta(){
		return VentaServiceImpl.listarVenta();
	}
	
	
	@PostMapping("/Venta")
	public Venta salvarVenta(@RequestBody Venta Venta) {
		
		return VentaServiceImpl.guardarVenta(Venta);
	}
	
	
	@GetMapping("/Venta/{id}")
	public Venta VentaXID(@PathVariable(name="id") int id) {
		
		Venta Venta_xid= new Venta();
		
		Venta_xid=VentaServiceImpl.VentaXID(id);
		
		System.out.println("Venta XID: "+Venta_xid);
		
		return Venta_xid;
	}
	
	@PutMapping("/Venta/{id}")
	public Venta actualizarVenta(@PathVariable(name="id")int id,@RequestBody Venta Venta) {
		
		Venta Venta_seleccionado= new Venta();
		Venta Venta_actualizado= new Venta();
		
		Venta_seleccionado= VentaServiceImpl.VentaXID(id);
		
		
		Venta_seleccionado.setCajeros(Venta.getCajeros());
		Venta_seleccionado.setMaquina(Venta.getMaquina());
		Venta_seleccionado.setProducto(Venta.getProducto());
		//Venta_seleccionado.setGrade(Venta.getGrade());
		
		Venta_actualizado = VentaServiceImpl.actualizarVenta(Venta_seleccionado);
		
		//System.out.println("El Venta actualizado es: "+ Venta_actualizado);
		
		return Venta_actualizado;
	}
	
	@DeleteMapping("/Venta/{id}")
	public void eliminarVenta(@PathVariable(name="id")int id) {
		VentaServiceImpl.eliminarVenta(id);
	}
	
	
}
