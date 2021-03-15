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
@Table(name="Investigadores")//en caso que la tabala sea diferente
public class Investigadores {

	//Atributos de entidad Investigadores
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nomapels;
	
	 @ManyToOne
	 @JoinColumn(name = "facultad")//busca ultimo valor e incrementa desde id final de db
	 private Facultad facultad;
		 
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Reserva> reserva;
    
   
    
    public Investigadores() {
    	
    }


	public Investigadores(int id, String nomapels, Facultad facultad, List<Reserva> reserva) {
		super();
		this.id = id;
		this.nomapels = nomapels;
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
	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	//public List<Reserva> getInvestigadores() {
	//	return reserva;
	//}

	//public void setEquipoReserva(List<Reserva> reserva) {
		//this.reserva = reserva;
	//}

	@Override
	public String toString() {
		return "Investigadores [id=" + id + ", nomapels=" + nomapels + ", facultad=" + facultad + "]";
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
