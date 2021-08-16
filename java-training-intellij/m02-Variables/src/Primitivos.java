import java.time.ZoneId;

public class Primitivos {

    public static void main(String[] args) {

        byte numeroByte = 7;

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("tipo byte su valor maximo " + Byte.MAX_VALUE);
        System.out.println("tipo byte su valor minimo " + Byte.MIN_VALUE);
        System.out.println("*** - *** - ***");

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("tipo short su valor maximo " + Short.MAX_VALUE);
        System.out.println("tipo short su valor minimo " + Short.MIN_VALUE);
        System.out.println("*** - *** - ***");

        int numeroInt = 52365412;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("tipo int su valor maximo " + Integer.MAX_VALUE);
        System.out.println("tipo int su valor mínimo " + Integer.MIN_VALUE);
        System.out.println("*** - *** - ***");

        long numeroLong = 456789123456L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bits a " + Integer.SIZE);
        System.out.println("tipo long su valor maximo " + Integer.MAX_VALUE);
        System.out.println("tipo long su valor mínimo " + Integer.MIN_VALUE);
        System.out.println("*** - *** - ***");

        var numeroVar = 9223372036854775L;

        
    }
}
