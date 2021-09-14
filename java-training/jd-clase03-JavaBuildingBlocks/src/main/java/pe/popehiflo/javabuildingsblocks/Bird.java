package pe.popehiflo.javabuildingsblocks;

public class Bird {

    String name;

    { //inicializador de instancia
        name = "Petter";
    }

    public static void main(String[] args) {
        System.out.println("1");
        {
            System.out.println("Padres");
        }
        System.out.println("2");
        {
            System.out.println("Hijos");
        }
        System.out.println("3");
    }
}
