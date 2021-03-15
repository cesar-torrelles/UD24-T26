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
@Table(name="Cientificos")//en caso que la tabala sea diferente
public class Cientificos {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name = "dni")
	private String id;
	@Column(name = "nomApels")//no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="dni")
    private List<Asignado_A> suministra;
	
	//Constructores
	
	public Cientificos() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param registroCurso
	 */
	public Cientificos(String id, String nombre, List<Asignado_A> registroCurso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.suministra = registroCurso;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	public List<Asignado_A> getSuministra() {
		return suministra;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setSuministra(List<Asignado_A> registroCurso) {
		this.suministra = registroCurso;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + "]";
	}


	
	
	
}
