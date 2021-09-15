/*
 * Mi clase en Java
 */

/**
 *
 * @author popehiflo
 */
public class HolaMundo {
    public static void main(String args[]) {
        System.out.println("Hola mundo desde JDK 15!");
        
        //Definimos la variable
        int miVariable = 10;
        System.out.println(miVariable);
        
        miVariable = 5;
        System.out.println(miVariable);
        
        String miVariableCadena = "Saludos, probando token Git";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios!";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVar = 10;
        System.out.println("miVAr = " + miVar);
        
        //Valores permitidos en el nombre de variables
        var permitido = 1;
        var _permitido = 2;
        var $permitido = 3;
    }
}
