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

import es.http.service.dto.Proyecto;
import es.http.service.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	ProyectoServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proyecto")
	public List<Proyecto> listarProyecto(){
		return proveedoresServiceImpl.listarProyecto();
	}
	
	
	@PostMapping("/proyecto")
	public Proyecto salvarProyecto(@RequestBody Proyecto curso) {
		
		return proveedoresServiceImpl.guardarProyecto(curso);
	}
	
	
	@GetMapping("/proyecto/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") int id) {
		
		Proyecto proveedores_xid= new Proyecto();
		
		proveedores_xid=proveedoresServiceImpl.proyectoXID(id);

		return proveedores_xid;
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")int id,@RequestBody Proyecto Estudiante) {
		
		Proyecto proveedores_seleccionado= new Proyecto();
		Proyecto proveedores_actualizado= new Proyecto();
		
		proveedores_seleccionado= proveedoresServiceImpl.proyectoXID(id);
		
		proveedores_seleccionado.setNombre(Estudiante.getNombre());
		
		proveedores_actualizado = proveedoresServiceImpl.actualizarProyecto(proveedores_seleccionado);
		
		return proveedores_actualizado;
	}
	
	@DeleteMapping("/proyecto/{id}")
	public void eleiminarProyecto(@PathVariable(name="id")int id) {
		proveedoresServiceImpl.eliminarProyecto(id);
	}
	
	
}
