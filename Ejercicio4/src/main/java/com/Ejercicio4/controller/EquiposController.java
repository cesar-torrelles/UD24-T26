package com.Ejercicio4.controller;

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

import com.Ejercicio4.dto.Equipos;
import com.Ejercicio4.service.EquiposServiceImpl;

@RestController
@RequestMapping("/api")
public class EquiposController {
	
	@Autowired
	EquiposServiceImpl EquiposServiceImpl;
	
	@GetMapping("/Equipos")
	public List<Equipos> listarCEquipos(){
		return EquiposServiceImpl.listarEquipos();
	}
	
	
	@PostMapping("/Equipos")
	public Equipos salvarEquipos(@RequestBody Equipos Equipos) {
		
		return EquiposServiceImpl.guardarEquipos(Equipos);
	}
	
	
	@GetMapping("/Equipos/{id}")
	public Equipos EquiposXID(@PathVariable(name="id") int id) {
		
		Equipos Equipos_xid= new Equipos();
		
		Equipos_xid=EquiposServiceImpl.EquiposXID(id);
		
		//System.out.println("Equipos XID: "+Equipos_xid);
		
		return Equipos_xid;
	}
	
	@PutMapping("/Equipos/{id}")
	public Equipos actualizarEquipos(@PathVariable(name="id")int id,@RequestBody Equipos Equipos) {
		
		Equipos Equipos_seleccionado= new Equipos();
		Equipos Equipos_actualizado= new Equipos();
		
		Equipos_seleccionado= EquiposServiceImpl.EquiposXID(id);
		
		Equipos_seleccionado.setnombre(Equipos.getnombre());
		Equipos_seleccionado.setFacultad(Equipos.getFacultad());
		
		//Equipos_seleccionado.setHoras(Equipos.getHoras());
		
		Equipos_actualizado = EquiposServiceImpl.actualizarEquipos(Equipos_seleccionado);
		
		//System.out.println("El Equipos actualizado es: "+ Equipos_actualizado);
		
		return Equipos_actualizado;
	}
	
	@DeleteMapping("/Equipos/{id}")
	public void eleiminarEquipos(@PathVariable(name="id")int id) {
		EquiposServiceImpl.eliminarEquipos(id);
	}
	
	
}
