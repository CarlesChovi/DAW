package codigo;


/*
 * Clase que nos permite restar dos n�meros enteros
 * */


public class Resta {
	//Inicializaci�n
	private int a;
	private int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	//Constructor
	public Resta(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a){
		this.a=a;
	}

	public void setB(int b){
		this.b=b;
	}
	
	//M�todo que permite restar dos n�meros enteros
	public int resta(){
		return a-b;
		
	}
	
	
}
