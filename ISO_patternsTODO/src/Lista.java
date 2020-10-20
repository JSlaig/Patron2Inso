import java.util.ArrayList;

public abstract class Lista {
	
	//Atributos
	private ArrayList<Integer> elementos;
	
	//Constructor
	public Lista() {
		elementos = new ArrayList<Integer>();
	}
	
	//Metodos
	
	public int getElemento(int pos) {
		int i = 0;
		for(int aux : elementos) {
			if(i+1 == pos) {
				return aux;
			}else {
				i++;
			}
		}	
		
		return -1;
	}
	
	public void insertarElemento(int elem) {		
		elementos.add(elem);
	}
	
	public void visualizar() {		
		for(int aux : elementos) {
			System.out.println(aux+" ");
		}
	}
	
	public abstract void configurar();

}
