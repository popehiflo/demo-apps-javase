package pe.popehiflo.operators;

import java.io.File;

public class Operators {

    public static void main(String[] args) {
        if (5.0 == 5) { // Se hace la promocion al tipo mayor
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //
        if (null==null) {
            System.out.println("true null");
        }

        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println("polar = " + polar);
        System.out.println("bear = " + bear);
        //--
        File monday = new File("schedule.txt");
        File tuesday = new File("schedule.txt");
        File wednesday = tuesday;
        System.out.println(monday == tuesday);
        System.out.println(tuesday == wednesday);

        String name;

        //instanceof Operator
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        Operators operators = new Operators();
        operators.openZoo(zooTime);

        System.out.println("LOGICAL");

        System.out.println("SHORT-CIRCUIT");
        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println("rabbit = " + rabbit + " ,bunny = " + bunny);

        int rat = 6;
        boolean rata = (rat > 6) || (++rat <= 7);
        System.out.println("rat = " + rat + " ,rat = " + rata);

        System.out.println("args: " + args.length);

        int k = 1;
        k += 3 + ++k;
        System.out.println("k =" + k);

        int[] a = new int[10];
        System.out.println(a[1]);
    }
    public void openZoo(Number time) {
        if (time instanceof Integer){
            System.out.println((Integer)time + " O'clock");
        } else {
            System.out.println(time);
        }
    }


}
