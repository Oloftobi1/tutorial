package guessinggame;

import java.util.Random;

public class guessingGame {
    public static void main(String[] args) {
        Random generator = new Random();
        int p1tries = 0;
        Player p1 = new Player("Bernd",generator.nextInt(10)+1,p1tries);
        Player p2 = new Player("Fred",generator.nextInt(10)+1,p1tries);
        Player p3 = new Player("Gerd",generator.nextInt(10)+1,p1tries);

        NumberToGuess number = new NumberToGuess(generator.nextInt(10)+1);
            boolean runp1 = true;
            while(runp1) {
                p1tries++;
                if (p1.getGuess() == number.getNumber()) {
                    System.out.printf("%s guessed %d it is right he took %d tries", p1.getName(), p1.getGuess(),p1tries);
                    runp1 = false;
                } else if (p1.getGuess() < 1 || p1.getGuess() > 10) {
                    System.out.printf("The number %s guessed is out of the Range!!!", p1.getName());
                } else {
                    System.out.printf("Player : %s Try : %d Guess : %d was False\n",p1.getName(),p1tries,p1.getGuess());
                    p1.setGuess(generator.nextInt(10)+1);
                }
            }

    }
}
