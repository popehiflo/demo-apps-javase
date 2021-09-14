public class Test {

    public String checkIt(String s){
        if(s.length() == 0 || s == null){
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }
    public static void main(String[] args){
        Test a = new Test();
        //System.out.println(a.checkIt(null));

        var dayOfWeek = 5;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("");
        }
        
        int lizard = 0;
        do {
            lizard++;
            System.out.println("lizard = " + lizard);
        } while (lizard < 10);
        
        String[] names = new String[3];
        names[0] = "Petter";
        names[1] = "Ruperta";
        names[2] = "Ariadna";
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
