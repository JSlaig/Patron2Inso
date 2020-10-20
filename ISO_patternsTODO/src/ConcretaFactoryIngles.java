
public class ConcretaFactoryIngles {
	
	//Atributos
	private Moneda moneda;
	private Lista lista;
	
	//Constructor
	public ConcretaFactoryIngles() {
		
		this.moneda = new MonedaUSA();
		this.lista = new ListaIngles();		
	}
	
	//Metodos
	
	public Moneda getMoneda() {
		return this.moneda;
	}
	
	public Lista getLista() {
		return this.lista;
	}

}
