 
public class ConcretaFactoryEspañol implements AbstractFactoryIdiomas{
	
	//Atributos
		private MonedaEspaña moneda;
		private ListaEspañol lista;
		
		//Constructor 2
		public ConcretaFactoryEspañol() {			
			this.moneda = new MonedaEspaña(1.0);
			this.lista = new ListaEspañol();		
		}
		
		//Metodos
		
		public MonedaEspaña getMoneda() {
			return this.moneda;
		}
		
		public ListaEspañol getLista() {
			return this.lista;
		}

}
