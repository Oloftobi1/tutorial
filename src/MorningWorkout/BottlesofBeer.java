package MorningWorkout;

import java.util.Random;

public class BottlesofBeer {
    public static void main(String[] args) {
        Random generator = new Random();
    String[] word1 = {"cool","smart","clever","stinky","tall","smart","old","young","gasy"};
    String[] word2 = {"twenty fifth ","ranker","low ranker","unordinary","ordinary"};
    String[] word3 = {"solution ","point","killer","slow","fast"};

    int part1 = word1.length;
    int part2 = word1.length;
    int part3 = word1.length;

     int rand1 = generator.nextInt(word1.length);
        int rand2 = generator.nextInt(word2.length);
        int rand3 = generator.nextInt(word3.length  );

        String phrase = word1[rand1]+" "+word2[rand2]+" "+word3[rand3];

        System.out.println(phrase);
    }
}

