package at.kpa.bais;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {

        Random random = new Random();
        int max = 10;
        int min = 5;
        int randomNumber = random.nextInt( max-min+1) +1;
        // Erstelle eine Zufallszahl zwischen 5 und 10

        switch(randomNumber){

            case 10:
                System.out.println("Ten");

                break;

            case 9:
                System.out.println("Nine");

                break;

            case 8:
                System.out.println("Eight");

                break;

            case 7:
                System.out.println("Seven");

                break;

            case 6:
                System.out.println("Six");

                break;

            case 5:
                System.out.println("Five");

                break;

        }
        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.

    }
}
