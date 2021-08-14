package pe.popehiflo.makeitreal;

import java.util.Iterator;

public class Main {
	
	public double calcularImpuestos(int edad, double ingresos) {
		if (edad >= 18 && ingresos >= 1000)
			return ingresos*0.4;
		else
			return 0;
	}
	
	public int asteriscos(String str) {
		int index, asterisco = 0;
		index = str.indexOf('*');
		
		while(index != -1) {
			asterisco++;
			index = str.indexOf('*', index + 1);
		}
		return asterisco;
	}
	
	public String duplicar(int arreglo[]) {
		int[] nuevoArreglo = new int[arreglo.length];
		String arregloLiteral = "[";
		for (int i = 0; i < arreglo.length; i++) {
			nuevoArreglo[i]=arreglo[i]*2;
			arregloLiteral = arregloLiteral + nuevoArreglo[i]+", ";
		}
		arregloLiteral= arregloLiteral.substring(0, arregloLiteral.length()-2) + "]";
		return arregloLiteral;
	}
	
	public static void countingDuplicates(String inputString) {
		int count;
		char[] arrayChar = inputString.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			count = 1;
			for (int j = i+1; j < arrayChar.length; j++) {
				if(arrayChar[i] == arrayChar[j] ) {
					count++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main test = new Main();
		System.out.println(test.calcularImpuestos(17, 5000));
		System.out.println("ASTERISCOS");
		System.out.println(test.asteriscos("H*o*l*a"));
		System.out.println(test.asteriscos("Hola"));
		int[] prueba = {3,12,45,7,0,500};
		System.out.println(test.duplicar(prueba));
		countingDuplicates("");
		
	}

	

}
