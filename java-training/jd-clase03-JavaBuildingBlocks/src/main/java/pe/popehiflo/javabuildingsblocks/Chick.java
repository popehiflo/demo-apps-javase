package pe.popehiflo.javabuildingsblocks;

public class Chick {

    private String name = "Fluffy";

    {//instance initializer
        System.out.println("estableciendo valor");
    }

    public Chick() {
        name = "Tiny";
        System.out.println("cambiando valor en el constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
