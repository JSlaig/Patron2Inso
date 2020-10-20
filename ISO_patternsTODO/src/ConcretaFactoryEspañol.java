 
public class ConcretaFactoryEspañol {
	
	//Atributos
		private Moneda moneda;
		private Lista lista;
		
		//Constructor 2
		public ConcretaFactoryEspañol() {
			
			this.moneda = new MonedaEspaña();
			this.lista = new ListaEspañol();		
		}
		
		//Metodos
		
		public Moneda getMoneda() {
			return this.moneda;
		}
		
		public Lista getLista() {
			return this.lista;
		}

}
