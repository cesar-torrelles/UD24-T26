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

import es.http.service.dto.Piezas;
import es.http.service.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {
	
	@Autowired
	PiezasServiceImpl cursoServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas(){
		return cursoServiceImpl.listarPiezas();
	}
	
	
	@PostMapping("/piezas")
	public Piezas salvarPiezas(@RequestBody Piezas piezas) {
		
		return cursoServiceImpl.guardarPiezas(piezas);
	}
	
	
	@GetMapping("/piezas/{id}")
	public Piezas piezasXID(@PathVariable(name="id") int id) {
		
		Piezas piezas_xid= new Piezas();
		
		piezas_xid=cursoServiceImpl.piezasXID(id);
		
		return piezas_xid;
	}
	
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPiezas(@PathVariable(name="id")int id,@RequestBody Piezas curso) {
		
		Piezas piezas_seleccionado= new Piezas();
		Piezas piezas_actualizado= new Piezas();
		
		piezas_seleccionado= cursoServiceImpl.piezasXID(id);
		
		piezas_seleccionado.setNombre(curso.getNombre());
		
		piezas_actualizado = cursoServiceImpl.actualizarPiezas(piezas_seleccionado);
		
		return piezas_actualizado;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPiezas(@PathVariable(name="id")int id) {
		cursoServiceImpl.eliminarPiezas(id);
	}
	
	
}
