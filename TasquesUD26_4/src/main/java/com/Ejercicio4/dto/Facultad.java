package com.Ejercicio4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="facultad")//en caso que la tabala sea diferente
public class Facultad {

	//Atributos de entidad facultad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Investigadores> investigadores;
    
    @OneToMany
    @JoinColumn(name="id")
    private List<Equipos> equipos;
	 
    
    
    public Facultad () {
    	
    }
    
	public Facultad(int id, String nombre, List<Investigadores> investigadores,
			List<Equipos> equipos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigadores")
	public List<Investigadores> getInvestigadores() {
		return investigadores;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "investigadores")
	public List<Equipos> getEquipos() {
		return equipos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setInvestigadores(List<Investigadores> investigadores) {
		this.investigadores = investigadores;
	}

	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
