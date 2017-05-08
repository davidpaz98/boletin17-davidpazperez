package Xeometría;

public class Xeometría {
	/**
	 * Metodo que calcula el perimetro de un poligono
	 * @param lado Medida del lado del poligono
	 * @return Resultado del perimetro
	 */

	public int perímetroCadrado(int lado) {
		int cadrado;     
		cadrado = lado * 4; 
		return cadrado;
	}
	
	/**
	 * Calcula el area de un cuadrado
	 * @param lado Medida del lado del cuadrado
	 * @return Resultado del area
	 */

	public int areaCadrado(int lado) {
		int area;
		area = lado * lado;
		return area;
	}
	
	/**
	 * Calcula la hipotenusa de un triangulo rectangulo con valores enteros
	 * @param catetoA Medida del catetoA
	 * @param catetoB Medida del catetoB
	 * @return Resultado de la hipotenusa
	 */

	public double teoremaPitagoras(int catetoA, int catetoB) {
		int hipotenusa;
		hipotenusa=(int) Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		return hipotenusa;
	}
	
	/**
	 * Calcula la hipotenusa con valores double
	 * @param hipotenusa Medida de la hipotenusa
	 * @param catetoA Medida del catetoA
	 * @return Resultado  del cateto
	 */
	
	public double teoremaPitagoras(double hipotenusa, double catetoA){
		double catetoB;
		catetoB=Math.sqrt(Math.pow(catetoA, 2) - Math.pow(hipotenusa,2));
		return catetoB;
	}


}
