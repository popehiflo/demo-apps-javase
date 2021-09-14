package pe.popehiflo.javabuildingsblocks;

public class AlcanceVariable {

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1; // Scope es solo dentro del if
        }

        //System.out.println(bitesOfCheese);
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if(hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountEaten = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}
