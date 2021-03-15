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

import es.http.service.dto.Proveedores;
import es.http.service.service.ProveedoresServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores(){
		return proveedoresServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedores salvarProveedores(@RequestBody Proveedores curso) {
		
		return proveedoresServiceImpl.guardarProveedores(curso);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedores proveedoresXID(@PathVariable(name="id") int id) {
		
		Proveedores proveedores_xid= new Proveedores();
		
		proveedores_xid=proveedoresServiceImpl.proveedoresXID(id);

		return proveedores_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id")int id,@RequestBody Proveedores Estudiante) {
		
		Proveedores proveedores_seleccionado= new Proveedores();
		Proveedores proveedores_actualizado= new Proveedores();
		
		proveedores_seleccionado= proveedoresServiceImpl.proveedoresXID(id);
		
		proveedores_seleccionado.setNombre(Estudiante.getNombre());
		
		proveedores_actualizado = proveedoresServiceImpl.actualizarProveedores(proveedores_seleccionado);
		
		return proveedores_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eleiminarProveedores(@PathVariable(name="id")int id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}
	
	
}
