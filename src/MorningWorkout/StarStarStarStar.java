package MorningWorkout;

public class StarStarStarStar {
    public static void main(String[] args) {

        for(int i = 0;i<4;i++){
            for (int j = 1;j<=4;j++){
                if (i==0||i==3){
                    System.out.print("$$$$");
                    break;
                } else if (j==1||j==4) {
                    System.out.print("$");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i<=6;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
