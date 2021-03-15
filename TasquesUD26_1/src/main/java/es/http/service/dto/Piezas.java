package es.http.service.dto;


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
@Table(name="piezas")//en caso que la tabala sea diferente
public class Piezas {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Suministra> suministra;
	
	//Constructores
	
	public Piezas() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param registroCurso
	 */
	public Piezas(int id, String nombre, List<Suministra> registroCurso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.suministra = registroCurso;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the registroCurso
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setSuministra(List<Suministra> registroCurso) {
		this.suministra = registroCurso;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + "]";
	}


	
	
	
}
