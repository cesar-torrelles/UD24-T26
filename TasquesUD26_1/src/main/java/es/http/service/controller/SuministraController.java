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

import es.http.service.dto.Suministra;
import es.http.service.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {
	
	@Autowired
	SuministraServiceImpl registroCursoServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra(){
		return registroCursoServiceImpl.listarSuministra();
	}
	
	
	@PostMapping("/suministra")
	public Suministra salvarSuministra(@RequestBody Suministra registroCurso) {
		
		return registroCursoServiceImpl.guardarSuministra(registroCurso);
	}
	
	
	@GetMapping("/suministra/{id}")
	public Suministra suministraXID(@PathVariable(name="id") int id) {
		
		Suministra RegistroCurso_xid= new Suministra();
		
		RegistroCurso_xid=registroCursoServiceImpl.suministraXID(id);

		return RegistroCurso_xid;
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id")int id,@RequestBody Suministra RegistroCurso) {
		
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
		
		suministra_seleccionado= registroCursoServiceImpl.suministraXID(id);
		
		
		suministra_seleccionado.setPiezas(RegistroCurso.getPiezas());
		suministra_seleccionado.setProveedores(RegistroCurso.getProveedores());
		suministra_seleccionado.setPrecio(RegistroCurso.getPrecio());
		
		suministra_actualizado = registroCursoServiceImpl.actualizarSuministra(suministra_seleccionado);

		return suministra_actualizado;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eliminarSuministra(@PathVariable(name="id")int id) {
		registroCursoServiceImpl.eliminarSuministra(id);
	}
	
	
}
