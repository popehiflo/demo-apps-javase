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
        // variables dinamicas var
        var numero3 = 15;


    }
}
