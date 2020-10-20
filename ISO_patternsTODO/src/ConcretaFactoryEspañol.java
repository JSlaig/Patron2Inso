 
public class ConcretaFactoryEspa�ol implements AbstractFactoryIdiomas{
	
	//Atributos
		private MonedaEspa�a moneda;
		private ListaEspa�ol lista;
		
		//Constructor 2
		public ConcretaFactoryEspa�ol() {			
			this.moneda = new MonedaEspa�a(1.0);
			this.lista = new ListaEspa�ol();		
		}
		
		//Metodos
		
		public MonedaEspa�a getMoneda() {
			return this.moneda;
		}
		
		public ListaEspa�ol getLista() {
			return this.lista;
		}

}
