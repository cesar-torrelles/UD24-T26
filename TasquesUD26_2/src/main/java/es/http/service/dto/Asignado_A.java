package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Asignado_A")//en caso que la tabala sea diferente
public class Asignado_A {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
    @ManyToOne
    @JoinColumn(name = "cientifico")
    Cientificos cientifico;
    
	@ManyToOne
    @JoinColumn(name = "proyecto")
    Proyecto proyecto;

	//Constructores
	
	public Asignado_A() {
	
	}

	public Asignado_A(int id, Proyecto proveedores, Cientificos curso) {
		this.id= id;
		this.proyecto = proveedores;
		this.cientifico = curso;
	}

	/**
	 * @return the estudiante
	 */
	public Proyecto getProyecto() {
		return proyecto;
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
	public void setProyecto(Proyecto estudiante) {
		this.proyecto = estudiante;
	}


	/**
	 * @return the curso
	 */
	public Cientificos getCientifico() {
		return cientifico;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setCientifico(Cientificos curso) {
		this.cientifico = curso;
	}


	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "RegistroCurso [proveedores=" + proyecto + ", piezas =" + cientifico + "]";
	}

	
	
	
	
	




		
	
	
	
}
