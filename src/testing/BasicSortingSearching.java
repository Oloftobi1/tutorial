package testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class BasicSortingSearching {
    public static void main(String[] args) {
        int found = -1;
        Random generator = new Random();
        ArrayList<Integer> rannumbers = new ArrayList<>();
        for (int i=1;i<=20;i++){
            rannumbers.add(generator.nextInt(100)+1);
        }
        System.out.println("UNSORTED");
        printNumbers(rannumbers);
        found = find(rannumbers,50);
        System.out.printf("The Number %d was %s found\n",50,found<0 ? "not" :"");

        Collections.sort(rannumbers,new IntegerComparator());
        System.out.println("SORTED");
        printNumbers(rannumbers);

        found = Collections.binarySearch(rannumbers,50,new IntegerComparator());
        System.out.printf("The Number %d was %s found\n",50,found<0 ? "not" :"");

}







     public static void printNumbers(ArrayList<Integer> numbers){
        for (int i =0;i<numbers.size();i++){
            System.out.printf("%d ",numbers.get(i));
        }
         System.out.println();
     }
     public static int find(ArrayList<Integer> a, Integer target){
       int found = -1;
       for (int i =0;i<a.size();i++){
           if (a.get(i)==target){
               found=1;
               break;
           }
       }
       return found;
     }
}
