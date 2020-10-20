
public abstract class Moneda {
	
	//Atributos
	String texto;
	double valor;
	
	//Metodos
	
	public String getTexto() {		
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public double getValor() {		
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		System.out.println(this.texto + ": " + this.valor);
	}
	
	public abstract void configurar();
	
}
