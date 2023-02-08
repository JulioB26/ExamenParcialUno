package Package1;

public class MetodosParaPalabras {
	public String cadena;

	public MetodosParaPalabras (String cadena) {
		this.cadena = cadena;
	}
	
	public String PrimeraMayuscula(String cadena) {
		String resultado;
		resultado = cadena.toUpperCase().charAt(0) + cadena.substring(1, cadena.length()).toLowerCase();
		
		return resultado;
	}
	
	public String invertirCadena(String cadena) {
		
		String resultado= "";
		
		for(int i = cadena.length()-1; i>=0;i--) {
			resultado = resultado + cadena.charAt(i);
		}
		
		return resultado;
	}
	
	public String VocalesMayuscula(String cadena) {
		
		String resultado = "";
		
		for(int i=0; i < cadena.length(); i++) {
			
			if((cadena.charAt(i)=='a')||(cadena.charAt(i)=='e')||(cadena.charAt(i)=='i')||(cadena.charAt(i)=='o')||(cadena.charAt(i)=='u')) {
				
				resultado = resultado + cadena.toUpperCase().charAt(i);
				
				}
			else {
				resultado = resultado + cadena.toLowerCase().charAt(i);
			}
		}
		cadena = resultado;
		return cadena;
	}
	
	public void fizzBuzz() {
		for(int i=1; i<=100; i++ ) {
			
			if(i %3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i %3==0) { 
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public void palindromo(String cadena) {
		
		String cadenam = "";
		String resultado ="";
		int cont=0;
		
		for(int i=0; i < cadena.length(); i++) {
			
			if(cadena.charAt(i)==' ') {
				
				cadenam= cadenam+"";
				
			}
			else {
				
				cadenam = cadenam + cadena.toLowerCase().charAt(i);
		
			}
		}
		
			for(int i = cadenam.length()-1; i>=0;i--) {
				
				resultado = resultado + cadenam.charAt(i);
				
			}
		
			for(int i=0; i < cadenam.length(); i++) {
				
				if(cadenam.charAt(i)==resultado.charAt(i)) {
					
					cont++;
					
				}
				else {

				}
			}
	
			if(cont==cadenam.length()) {
				System.out.println("La cadena ingresada" + " " + cadena + " " + "es un palindromo");
	
			}
			
			else {
				System.out.println("La cadena ingresada" + " " + cadena + " " + "no es un palindromo");
			}
		}

}