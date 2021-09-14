package pe.popehiflo.javabuildingsblocks;

public class VariablesLocales {

    public void findAnswer(boolean check) {

        // Variables locales
        /* Que estan dentro de un metodo,
           estas no tienen un valor por defecto
        */
        int answer;
        int otherAnswer;
        int onlyOneBranch;

        if (check) {
            answer = 1;
            onlyOneBranch = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
        //System.out.println(onlyOneBranch);
    }

    public void checkAnswer() {
        boolean value;
        //findAnswer(value);
    }
}
