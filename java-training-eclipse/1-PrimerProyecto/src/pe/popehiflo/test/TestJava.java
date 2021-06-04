package pe.popehiflo.test;

public class TestJava {
	
	public static int sumarNumeros(int[] arreglo) {
		
		int suma = 0;
		
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i]%2 != 0)
				suma = suma + arreglo[i];
		}
		
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola!");
		int[] nuevoArreglo = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(sumarNumeros(nuevoArreglo));
	}

}
