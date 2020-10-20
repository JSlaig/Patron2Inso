
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
	//Esto es un comentario de prueba
	//Sgundo comentario de prueba
	//tercer comentario de prueba
	
	public void visualizaElems() {
		this.lista.visualizar();
		
		System.out.println();
		
		this.moneda.visualizar();
		
		System.out.println();
	}
}
