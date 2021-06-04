/**
 * 
 */
package pe.popehiflo.modulo5;

/**
 * @author popehiflo
 * Clase para explicar las sentencias de control if, if else
 */
public class SentenciaControl {
	
	public static void main(String[] args) {
		
		boolean estatus = true;
		
		if (estatus) {
			System.out.println("El estado es verdadero");
		}
		
		sentenciaSwitch();
		matrices();
	}
	
	public static void sentenciaSwitch() {
		
		String nombre = "Petterr";
		
		switch (nombre) {
		case "Pool":
			System.out.println("Nombre es: " + nombre);
			break;
		
		case "Petter":
			System.out.println("Nombre es: " + nombre);
			break;
		default:
			System.out.println("Nombre no coincide");
			break;
		}
	}
	
	/**
	 * Metodo  que permite explicar el funcionamiento de las matrices
	 */
	public static void matrices() {
		
		int[] arrayEnterosNuevos = {1,2,3,4};
		
		// Creando e inicializando un arreglo en la misma linea
		//int[] arrayEnteros = new int[] {1,2,3,5};
		int[] arrayEnteros = new int[4];
		
		arrayEnteros[0] = 1;
		arrayEnteros[1] = 2;
		arrayEnteros[2] = 3;
		arrayEnteros[3] = 5;
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.print(arrayEnteros[i]);
		}
		
		int[][] arrayMultiEnteros = {{1,2,3,4},{5,6,7,8}};
		
		for (int i = 0; i < arrayMultiEnteros.length; i++) {
			for (int j = 0; j < arrayMultiEnteros[i].length; j++) {
				System.out.print(arrayMultiEnteros[i][j]);
			}
		}
	}

}
