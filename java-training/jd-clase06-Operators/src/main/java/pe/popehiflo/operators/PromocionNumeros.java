package pe.popehiflo.operators;

public class PromocionNumeros {

    //var x = 1;
    public static void main(String[] args) {

        int a,b,c;
        a = b = c = 1;
        double d = 10000000;
        d = 10_000_000;
        int x = 1;
        long y = 33;

        var z = x * y;

        System.out.println("z = " + z);
        System.out.println("x es de tipo: "+((Object)x).getClass().getName());
        System.out.println("y es de tipo: "+((Object)y).getClass().getName());
        System.out.println("z es de tipo: "+((Object)z).getClass().getName());

        //double x1 = 2.5;
        //float y1 = 3.6;
        //var z1 = x1 * y1;

        short x2 = 10;
        short y2 = 3;
        var z2 = x2 * y2;

        short w3 = 14;
        float x3 = 13;
        double y3 = 30;
        var z3 = w3 * x2 / y2;
        System.out.println("z3 = " + z3);

        int fur = (int) 5;
        int hair = (short) 2;
    }
}
