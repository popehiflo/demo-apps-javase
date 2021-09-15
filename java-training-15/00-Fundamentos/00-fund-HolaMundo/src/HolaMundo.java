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

        //Concatenacion
        var usuario = "Pool";
        var titulo = "Ingenierio";
        var union = titulo + " " + usuario;
        System.out.println("concatenacion: " + union);
        var i = 3;
        var j = 4;
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        
        //Caracteres especiales
        var nombre = "Mickela";
        System.out.println("Nueva linea: \n"+ nombre);
        System.out.println("Tabulador: \t"+ nombre);
        System.out.println("Retroceso: \b"+ nombre);
        System.out.println("Comilla simple: \'"+ nombre+"\'");
        System.out.println("Comilla doble: \""+ nombre+"\"");
    }
}
