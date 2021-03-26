import java.util.Arrays;
import java.util.Locale;

public class HolaMundo {

    public static void main(String[] args) {
        String saludar = "Hello World from Java!";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());
        
        int numeric = 10;
        System.out.println("numeric = " + numeric);

        boolean valor = true;

        if (valor) {
            System.out.println("numeric = " + numeric);
            int numeric2 = 10;
        }
        // variables dinámicas var
        var numero3 = 15;

        //sout - System.out.println()
        //soutv - System.out.println("ultimaVariableQueEncuentra = " + ultimaVariableQueEncuentra)
        System.out.println("numero3 = " + numero3);

        int edadPersona = 5;
    }
}
