package es.http.service.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="suministra")//en caso que la tabala sea diferente
public class Suministra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
    @ManyToOne
    @JoinColumn(name = "codigoPieza")
    Piezas piezas;
    
	@ManyToOne
    @JoinColumn(name = "idProveedor")
    Proveedores proveedores;
	
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	//Constructores
	
	public Suministra() {
	
	}

	public Suministra(int id, Proveedores proveedores, Piezas curso,int grade) {
		this.id= id;
		this.proveedores = proveedores;
		this.piezas = curso;
		this.precio = grade;
	}

	/**
	 * @return the estudiante
	 */
	public Proveedores getProveedores() {
		return proveedores;
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
	 * @param estudiante the estudiante to set
	 */
	public void setProveedores(Proveedores estudiante) {
		this.proveedores = estudiante;
	}


	/**
	 * @return the curso
	 */
	public Piezas getPiezas() {
		return piezas;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setPiezas(Piezas curso) {
		this.piezas = curso;
	}



	/**
	 * @return the grade
	 */
	public int getPrecio() {
		return precio;
	}


	/**
	 * @param grade the grade to set
	 */
	public void setPrecio(int grade) {
		this.precio = grade;
	}

	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "RegistroCurso [proveedores=" + proveedores + ", piezas =" + piezas + ", precio=" + precio + "]";
	}

	
	
	
	
	




		
	
	
	
}
