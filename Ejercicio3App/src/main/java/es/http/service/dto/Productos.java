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
@Table(name="Productos")//en caso que la tabala sea diferente
public class Productos {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@Column(name = "Precio")//no hace falta si se llama igual
	private int precio;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Venta> venta;
	
	//Constructores
	
	public Productos() {
	
	}

	
	public Productos(int id, String nombre, int precio, List<Venta> venta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.venta = venta;
	}

	
	/**
	 * @return the Venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param Venta the Venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
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


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", venta=" + venta + "]";
	}

	

	
	
	
}
