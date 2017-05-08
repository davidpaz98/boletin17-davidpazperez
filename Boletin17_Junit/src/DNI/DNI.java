package DNI;

import java.util.ArrayList;
import java.util.Iterator;

public class DNI {
	/**
	 * Longitud del DNI es correcta
	 * @param numeroLetra
	 * @return true si es correcto y false si es incorrecto
	 */
	public boolean eValido(String numeroLetra){
		String letra="";
		if(numeroLetra.length()!=9){
			return false;
		}
		return true;
	}
	
	/**
	 * Calcula una letra
	 * @param numero Es el numero del DNI en formato String
	 * @return Devuelve el codigo ascii de una letra
	 */
	public int calculaLetra(String numero){
		String restos="TRWAGMYFPDXBNJZSQVHLCKE";
		int dni=Integer.parseInt(numero);
		int resto= dni%23;
		char a=restos.charAt(resto);
		return (int)a;
		
	}
	/**
	 * Letra o numero es correcto o no
	 * @param numeros Es el numero del DNI
	 * @param letra Es la letra del DNI
	 * @return Devuelve true si es letra y false si es numero
	 */
	public boolean eValido (ArrayList<Integer> numeros, char letra){
		int letranumero;
		letranumero=calculaLetra(numeros);
		if(letranumero==(int) letra)
			return true;

		return false;
	}
	
	/**
	 * Calcula una letra
	 * @param numeros Son los numeros del DNI
	 * @return Devulve el codigo ascii
	 */
	public int calculaLetra (ArrayList<Integer>numeros){
		String elemento = null;
		Iterator<Integer> nombreIterator = numeros.iterator();
		while(nombreIterator.hasNext()){
			elemento = Integer.toString(((Iterator<Integer>) numeros).next());	
		}
		// convertir el string en numero
		int dni=Integer.parseInt(elemento);
		// dividirlo entre 23 y calcular el resto
		return dni%23;
	}

	
	

}
