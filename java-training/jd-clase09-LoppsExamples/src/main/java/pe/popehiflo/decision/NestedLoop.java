package pe.popehiflo.decision;

public class NestedLoop {

    public static void main(String[] args) {
        int[][] myComplexArray = {{5,3,1}, {1,2,6,9},{5,7,12,9}};

        for (int[] mySimpleArray: myComplexArray){
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
        
        String n = "Hola";
        n.concat("m");
        System.out.println("n = " + n);        

        StringBuilder sb0 = new StringBuilder();
        System.out.println("sb0 capacity= " + sb0.capacity());

        StringBuilder sb1 = new StringBuilder("12345");
        System.out.println("sb1 capacity= " + sb1.capacity());

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println("sb2 capacity= " + sb2.capacity());

        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);
        System.out.println("javaworld = " + javaworld);
        System.out.println("java = " + java);


    }
}
