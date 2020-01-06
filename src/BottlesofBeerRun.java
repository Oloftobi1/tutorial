import java.util.Scanner;

public class BottlesofBeerRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Bears you have ? ");
        int bears = input.nextInt();
        for (int i = 1;i<=bears;bears--){
            System.out.printf("%d Bottles of beer on the wall, %d bottles of beer." +
                    " If one of those bottles should happen to fall, " +
                    "%d bottles of beer on the Wall! \n",bears,bears,bears-1);
        }

    }
}
