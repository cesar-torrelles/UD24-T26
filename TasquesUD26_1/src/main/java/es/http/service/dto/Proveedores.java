package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proveedores") // en caso que la tabala sea diferente
public class Proveedores {

	// Atributos de entidad estudiante
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Suministra> suministra;

	// Constructores

	public Proveedores() {

	}

	public Proveedores(String id, String nombre, List<Suministra> suministra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	// Getters y Setters
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
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + "]";
	}

}
