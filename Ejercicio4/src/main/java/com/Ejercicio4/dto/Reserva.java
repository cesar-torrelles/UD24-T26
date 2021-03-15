package com.Ejercicio4.dto;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Reserva")//en caso que la tabala sea diferente
public class Reserva {

	//Atributos de entidad 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "investigadores")//busca ultimo valor e incrementa desde id final de db
	private Investigadores investigadores;
	
	 @ManyToOne
	@JoinColumn(name = "equipos")//busca ultimo valor e incrementa desde id final de db
	private Equipos equipos;
	
	 @Column(name = "comienzo")//no hace falta si se llama igual
		private String comienzo;
	 
	 @Column(name = "fin")//no hace falta si se llama igual
		private String fin;
	
	
	
    public Reserva () {
    	
    }



	public Reserva(int id, Investigadores investigadores, Equipos equipos, String comienzo, String fin) {
		super();
		this.id = id;
		this.investigadores = investigadores;
		this.equipos = equipos;
		this.comienzo = comienzo;
		this.fin = fin;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Investigadores getInvestigadores() {
		return investigadores;
	}



	public void setInvestigadores(Investigadores investigadores) {
		this.investigadores = investigadores;
	}



	public Equipos getEquipos() {
		return equipos;
	}



	public void setEquipos(Equipos equipos) {
		this.equipos = equipos;
	}



	public String getComienzo() {
		return comienzo;
	}



	public void setComienzo(String comienzo) {
		this.comienzo = comienzo;
	}



	public String getFin() {
		return fin;
	}



	public void setFin(String fin) {
		this.fin = fin;
	}



	
	

	



	


	

	
	
	
	
	




		
	
	
	
}
