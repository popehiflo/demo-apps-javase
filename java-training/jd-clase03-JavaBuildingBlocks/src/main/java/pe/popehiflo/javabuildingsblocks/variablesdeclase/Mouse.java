package pe.popehiflo.javabuildingsblocks.variablesdeclase;

public class Mouse {

    final static int MAX_LENGTH = 5;
    final static double PI = 3.14159;
    int length;

    public void grow(int inches) {

    }

    public static void main() {
        Mouse mouse1 = new Mouse();
        //mouse1.MAX_LENGTH = 1;
        mouse1.length = 3;

        Mouse mouse2 = new Mouse();
        //mouse1.MAX_LENGTH = 2;
        mouse1.length = 6;

        Mouse mouse3 = new Mouse();
        //mouse1.MAX_LENGTH = 3;
        mouse1.length = 9;

        System.out.println(mouse1.MAX_LENGTH);
        System.out.println("mouse3 = " + mouse3.length);
    }
}
