package pe.popehiflo.operators;

public class OperadoresUnarios {

    public static void main(String[] args) {
        double zooTemperature = 1.21;

        System.out.println(zooTemperature);

        //int pelican = !5;             // Does not COMPILE
        //boolean penguin = -true;      // Does not COMPILE
        //boolean peacock = !0;         //Does not COMPILE

        int parkAttendance = 0;
        System.out.println(parkAttendance);     //0
        System.out.println(++parkAttendance);   //1
        System.out.println(parkAttendance);     //1
        System.out.println(parkAttendance--);   //1
        System.out.println(parkAttendance);     //0

        int lion = 3;
        int tiger = ++lion*5/lion--;
        System.out.println("lion = " + lion);
        System.out.println("tiger = " + tiger);
    }
}
