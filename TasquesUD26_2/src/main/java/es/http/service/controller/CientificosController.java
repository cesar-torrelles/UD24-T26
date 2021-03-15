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

import es.http.service.dto.Cientificos;
import es.http.service.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificosController {
	
	@Autowired
	CientificosServiceImpl cursoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cursoServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientificos(@RequestBody Cientificos curso) {
		
		return cursoServiceImpl.guardarCientificos(curso);
	}
	
	
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificosXID(@PathVariable(name="dni") int id) {
		
		Cientificos cientificos_xid= new Cientificos();
		
		cientificos_xid=cursoServiceImpl.cientificosXID(id);
		
		return cientificos_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")int id,@RequestBody Cientificos curso) {
		
		Cientificos cientificos_seleccionado= new Cientificos();
		Cientificos cientificos_actualizado= new Cientificos();
		
		cientificos_seleccionado= cursoServiceImpl.cientificosXID(id);
		
		cientificos_seleccionado.setNombre(curso.getNombre());
		
		cientificos_actualizado = cursoServiceImpl.actualizarCientificos(cientificos_seleccionado);
		
		return cientificos_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientificos(@PathVariable(name="dni")int id) {
		cursoServiceImpl.eliminarCientificos(id);
	}
	
	
}
