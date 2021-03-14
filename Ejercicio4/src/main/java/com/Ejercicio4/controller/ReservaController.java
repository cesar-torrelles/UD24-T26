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

import com.Ejercicio4.dto.Reserva;
import com.Ejercicio4.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
	
	@Autowired
	ReservaServiceImpl ReservaServiceImpl;
	
	@GetMapping("/Reserva")
	public List<Reserva> listarCReserva(){
		return ReservaServiceImpl.listarReserva();
	}
	
	
	@PostMapping("/Reserva")
	public Reserva salvarReserva(@RequestBody Reserva Reserva) {
		
		return ReservaServiceImpl.guardarReserva(Reserva);
	}
	
	
	@GetMapping("/Reserva/{id}")
	public Reserva ReservaXID(@PathVariable(name="id") int id) {
		
		Reserva Reserva_xid= new Reserva();
		
		Reserva_xid=ReservaServiceImpl.ReservaXID(id);
		
		//System.out.println("Reserva XID: "+Reserva_xid);
		
		return Reserva_xid;
	}
	
	@PutMapping("/Reserva/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id")int id,@RequestBody Reserva Reserva) {
		
		Reserva Reserva_seleccionado= new Reserva();
		Reserva Reserva_actualizado= new Reserva();
		
		Reserva_seleccionado= ReservaServiceImpl.ReservaXID(id);
		
		Reserva_seleccionado.setComienzo(Reserva.getComienzo());
		Reserva_seleccionado.setFin(Reserva.getFin());
		
		//Reserva_seleccionado.setHoras(Reserva.getHoras());
		
		Reserva_actualizado = ReservaServiceImpl.actualizarReserva(Reserva_seleccionado);
		
		//System.out.println("El Reserva actualizado es: "+ Reserva_actualizado);
		
		return Reserva_actualizado;
	}
	
	@DeleteMapping("/Reserva/{id}")
	public void eleiminarReserva(@PathVariable(name="id")int id) {
		ReservaServiceImpl.eliminarReserva(id);
	}
	
	
}
