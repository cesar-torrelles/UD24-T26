package com.Ejercicio4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="Equipos")//en caso que la tabala sea diferente
public class Equipos {

	//Atributos de entidad Equipos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	 @ManyToOne
	 @JoinColumn(name = "facultad")//busca ultimo valor e incrementa desde id final de db
	 private Facultad facultad;
		 
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> reserva;
    
   
    
	
    public Equipos() {
	
    }
	public Equipos(int id, String nombre, Facultad facultad, List<Reserva> reserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}
	
	//@JsonIgnore
	//@ManyToOne(fetch = FetchType.LAZY, mappedBy = "facultad")
	//public List<Facultad> getId() {
	//	return facultad;
	//}
	
	
	
	
	public void getId(int id) {
		this.id=id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	//public List<Reserva> getReserva() {
	//	return reserva;
	//}

	//public void setReserva(List<Reserva> reserva) {
	//	this.reserva = reserva;
	//}

	@Override
	public String toString() {
		return "Equipos [id=" + id + ", nombre=" + nombre + ", facultad=" + facultad + "]";
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
