
public class Principal {
	    public static void main(String[] args)
	    {
	        // CREAR EN ESPAÑOL 
	    	
	         Cliente cliente = null;
	         
	         cliente = new Cliente( new ConcretaFactoryEspa�ol() );
	         cliente.visualizaElems();
	     
	      
	         // CREAR EN INGLES
	         cliente = new Cliente ( new ConcretaFactoryIngles() );
	         cliente.visualizaElems();
		     
	    }    
	       
	}

 