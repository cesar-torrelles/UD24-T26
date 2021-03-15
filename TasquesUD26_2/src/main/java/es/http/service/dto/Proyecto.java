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
@Table(name = "Proyecto") // en caso que la tabala sea diferente
public class Proyecto {

	// Atributos de entidad estudiante
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "horas") // no hace falta si se llama igual
	private int horas;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Asignado_A> suministra;

	// Constructores

	public Proyecto() {

	}

	public Proyecto(String id, String nombre, int horas, List<Asignado_A> suministra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
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
	public List<Asignado_A> getSuministra() {
		return suministra;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setSuministra(List<Asignado_A> suministra) {
		this.suministra = suministra;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + "]";
	}

}
