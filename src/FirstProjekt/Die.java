package FirstProjekt;

import java.util.Random;

public class Die {
    int sides;
    int value;

    private int leben;
    Random generator;

    public Die(int sides) {
        this.sides = sides;
        generator = new Random();
        this.value = this.roll();
    }

    public Die(int sides, int seed) {
        this.sides = sides;
        this.generator = new Random(seed);
    }

    public int roll() {
        this.value = generator.nextInt(this.sides) + 1;
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public int getSides() {
        return this.sides;
    }
}


