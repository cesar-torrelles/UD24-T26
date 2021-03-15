package es.http.service.dto;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Venta")//en caso que la tabala sea diferente
public class Venta {

	//Atributos de entidad 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cajeros")//busca ultimo valor e incrementa desde id final de db
	private Cajeros cajeros;
	
	 @ManyToOne
	@JoinColumn(name = "maquinas")//busca ultimo valor e incrementa desde id final de db
	private Maquinas maquinas;
	
	 @ManyToOne
	@JoinColumn(name = "productos")//busca ultimo valor e incrementa desde id final de db
	private Productos productos;
	
	
	
    public Venta () {
    	
    }
    

	//Constructores
    
    public Venta(int id, Cajeros cajeros, Maquinas maquina, Productos producto) {
		this.id = id;
		this.cajeros = cajeros;
		this.maquinas = maquina;
		this.productos = producto;

	}
    
    //getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajeros getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}

	public Maquinas getMaquina() {
		return maquinas;
	}

	public void setMaquina(Maquinas maquina) {
		this.maquinas = maquina;
	}

	public Productos getProducto() {
		return productos;
	}

	public void setProducto(Productos producto) {
		this.productos = producto;
	}



	


	

	
	
	
	
	




		
	
	
	
}
