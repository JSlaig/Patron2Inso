 
public class ConcretaFactoryEspa�ol {
	
	//Atributos
		private Moneda moneda;
		private Lista lista;
		
		//Constructor 2
		public ConcretaFactoryEspa�ol() {
			
			this.moneda = new MonedaEspa�a();
			this.lista = new ListaEspa�ol();		
		}
		
		//Metodos
		
		public Moneda getMoneda() {
			return this.moneda;
		}
		
		public Lista getLista() {
			return this.lista;
		}

}
