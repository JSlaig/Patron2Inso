
public class Cliente {
	
	//Atributos
	private Lista lista;
	private Moneda moneda;
	
	//Constructor
	public Cliente(AbstractFactoryIdiomas idiomas) {
		this.lista = idiomas.getLista();
		this.moneda = idiomas.getMoneda();
	}

	//Metodos
	
	public void visualizaElems() {
		this.lista.visualizar();
		
		System.out.println();
		
		this.moneda.visualizar();
		
		System.out.println();
	}
}
