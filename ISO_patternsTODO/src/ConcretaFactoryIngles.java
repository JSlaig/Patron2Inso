
public class ConcretaFactoryIngles {
	
	//Atributos
	private MonedaUSA moneda;
	private ListaIngles lista;
	
	//Constructor
	public ConcretaFactoryIngles() {
		
		this.moneda = new MonedaUSA(1.18);
		this.lista = new ListaIngles();		
	}
	
	//Metodos
	
	public MonedaUSA getMoneda() {
		return this.moneda;
	}
	
	public ListaIngles getLista() {
		return this.lista;  
	}

}
