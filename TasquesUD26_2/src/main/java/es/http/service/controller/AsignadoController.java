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

import es.http.service.dto.Asignado_A;
import es.http.service.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {
	
	@Autowired
	AsignadoServiceImpl registroCursoServiceImpl;
	
	@GetMapping("/asignado")
	public List<Asignado_A> listarAsignado(){
		return registroCursoServiceImpl.listarAsignado();
	}
	
	
	@PostMapping("/asignado")
	public Asignado_A salvarAsignado(@RequestBody Asignado_A registroCurso) {
		
		return registroCursoServiceImpl.guardarAsignado(registroCurso);
	}
	
	
	@GetMapping("/asignado/{id}")
	public Asignado_A asignadoXID(@PathVariable(name="id") int id) {
		
		Asignado_A RegistroCurso_xid= new Asignado_A();
		
		RegistroCurso_xid=registroCursoServiceImpl.asignadoXID(id);

		return RegistroCurso_xid;
	}
	
	@PutMapping("/asignado/{id}")
	public Asignado_A actualizarAsignado(@PathVariable(name="id")int id,@RequestBody Asignado_A RegistroCurso) {
		
		Asignado_A asignado_seleccionado= new Asignado_A();
		Asignado_A asignado_actualizado= new Asignado_A();
		
		asignado_seleccionado= registroCursoServiceImpl.asignadoXID(id);
		
		
		asignado_seleccionado.setCientifico(RegistroCurso.getCientifico());
		asignado_seleccionado.setProyecto(RegistroCurso.getProyecto());
		
		asignado_actualizado = registroCursoServiceImpl.actualizarAsignado(asignado_seleccionado);

		return asignado_actualizado;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignado(@PathVariable(name="id")int id) {
		registroCursoServiceImpl.eliminarAsignado(id);
	}
	
	
}
