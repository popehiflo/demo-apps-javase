/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author poolp
 */
public class TiposDatos {
    
    public static void main(String args[]) {
        
        // Tipos primitivos enteros: byte, short, int, long
        byte numeroByte = 10;
        System.out.println("valor minimo byte: "+Byte.MIN_VALUE);
        System.out.println("valor maximo byte: "+Byte.MAX_VALUE);
        byte otroByte = (byte)129;
        System.out.println("forzado a byte(129): " + otroByte);
        
        short numeroShort = 10;
        System.out.println("valor minimo short: "+Short.MIN_VALUE);
        System.out.println("valor maximo short: "+Short.MAX_VALUE);
        short otroShort = (short)32769;
        System.out.println("forzado a short(32769): " + otroShort);
        
        int numeroInt = 10;
        System.out.println("valor minimo int: "+Integer.MIN_VALUE);
        System.out.println("valor maximo int: "+Integer.MAX_VALUE);
        int otroInt = (int)2147483648L;
        System.out.println("forzado a int(2147483648L): " + otroInt);
        
        long numeroLong = 10;
        System.out.println("valor minimo long: "+Long.MIN_VALUE);
        System.out.println("valor maximo long: "+Long.MAX_VALUE);
        long otroLong = (long)9223372036854775808F;
        System.out.println("forzado a long(9223372036854775808F): " + otroLong);
    }
}
