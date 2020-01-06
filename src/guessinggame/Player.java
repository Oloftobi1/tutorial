package guessinggame;

public class Player {
    String name;
    public int guess;
    public int tries;

    public Player(String name , int guess,int tires){
        this.name =name;
        this.guess=guess;
        this.tries=tries;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setGuess(int guess) {
        this.guess = guess;
    }public int getGuess() { return guess; }

    public void setTries(int tries) {
        this.tries = tries;
    }public int getTries() { return tries; }
}
