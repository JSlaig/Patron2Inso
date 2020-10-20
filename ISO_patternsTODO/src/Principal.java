
public class Principal {
	    public static void main(String[] args)
	    {
	        // CREAR EN ESPAÃ‘OL 
	    	
	         Cliente cliente = null;
	         
	         cliente = new Cliente( new ConcretaFactoryEspañol() );
	         cliente.visualizaElems();
	     
	      
	         // CREAR EN INGLES
	         cliente = new Cliente ( new ConcretaFactoryIngles() );
	         cliente.visualizaElems();
		     
	    }    
	       
	}

 