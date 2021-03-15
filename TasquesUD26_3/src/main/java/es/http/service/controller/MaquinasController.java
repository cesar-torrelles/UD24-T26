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

import es.http.service.dto.Maquinas;
import es.http.service.service.MaquinasServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinasController {
	
	@Autowired
	MaquinasServiceImpl MaquinasServiceImpl;
	
	@GetMapping("/Maquinas")
	public List<Maquinas> listarCMaquinass(){
		return MaquinasServiceImpl.listarMaquinas();
	}
	
	
	@PostMapping("/Maquinas")
	public Maquinas salvarMaquinas(@RequestBody Maquinas Maquinas) {
		
		return MaquinasServiceImpl.guardarMaquinas(Maquinas);
	}
	
	
	@GetMapping("/Maquinas/{id}")
	public Maquinas MaquinasXID(@PathVariable(name="id") int id) {
		
		Maquinas Maquinas_xid= new Maquinas();
		
		Maquinas_xid=MaquinasServiceImpl.MaquinasXID(id);
		
		//System.out.println("Maquinas XID: "+Maquinas_xid);
		
		return Maquinas_xid;
	}
	
	@PutMapping("/Maquinas/{id}")
	public Maquinas actualizarMaquinas(@PathVariable(name="id")int id,@RequestBody Maquinas Maquinas) {
		
		Maquinas Maquinas_seleccionado= new Maquinas();
		Maquinas Maquinas_actualizado= new Maquinas();
		
		Maquinas_seleccionado= MaquinasServiceImpl.MaquinasXID(id);
		
		Maquinas_seleccionado.setPiso(Maquinas.getPiso());
		//Maquinas_seleccionado.setHoras(Maquinas.getHoras());
		
		Maquinas_actualizado = MaquinasServiceImpl.actualizarMaquinas(Maquinas_seleccionado);
		
		//System.out.println("El Maquinas actualizado es: "+ Maquinas_actualizado);
		
		return Maquinas_actualizado;
	}
	
	@DeleteMapping("/Maquinas/{id}")
	public void eliminarMaquinas(@PathVariable(name="id")int id) {
		MaquinasServiceImpl.eliminarMaquinas(id);
	}
	
	
}
