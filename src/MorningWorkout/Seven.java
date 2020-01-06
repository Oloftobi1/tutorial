package MorningWorkout;

public class Seven {
    public static void main(String[] args) {
      int array[] = {1,2,3,4};
      for (int k : array){
          System.out.println(k);
      }

      int array1[][] = {
              {1,2,3,4},
              {3,5,3},
              {2,3,6,5}
      };

      for (int k[] : array1){
          for (int l : k){
              System.out.println(l);
          }
      }
    }
}
