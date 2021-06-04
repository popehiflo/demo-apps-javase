package pe.popehiflo.clase1;

/**
 * 
 * @author poolp
 * Clase generada para entender la estructura del lenguaje de programacion
 * Java (Variables de instancia y locales, static, clases, metodos, tipos de datos)
 */
public class PrimerClase {
	
	/**
	 * Variable de instancia de tipo byte
	 */
	static byte numeroByte = 5;
	/**
	 * Variable de instancia de tipo short
	 */
	short numeroShort = 5;
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Sumar: " + sumar(15, 15));
	}
	
	// solo si es static puede ser invocado dentro de main que es static
	/**
	 * Metodo que suma dos numero de tipo int
	 * @param a - primer parametro de tipo int
	 * @param b - segundo parametro de tipo int
	 * @return - a + b 
	 */
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	

}
