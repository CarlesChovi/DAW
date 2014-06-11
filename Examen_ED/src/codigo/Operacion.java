package codigo;

import static org.junit.Assert.*; 
import org.junit.Test;  


public class Operacion {  
 
  @Test  
  public void testResta() {  
       
	        Resta resta = new Resta(4, 2);  
	        int resultado = resta.resta();  
	        assertTrue(resultado == 2);  
	        
	        System.out.println(resta);
	    }  
  }  


