package testing;

import javax.swing.*;
import java.util.Scanner;

public class ArrayYoutube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Channel;
        int abos;
        Youtube[] youtuber = new Youtube[4];
        int difference;

        for (int i =0;i<youtuber.length;i++) {
            System.out.printf("Enter a Abos and the Youtube Channel : ",youtuber[i]);
            abos = input.nextInt();
            Channel = input.nextLine();
            youtuber[i] = new Youtube(Channel,abos);

        }
        System.out.printf("#\tChannel\tabos\n");
        System.out.printf("-\t-------\t-----\n");
        for (int i = 0; i<youtuber.length;i++){
            System.out.printf("%d\t%s\t%d\n",i,youtuber[i].Channel(),youtuber[i].abos());
        }
        for (int i = 0; i<youtuber.length;i++){

        }
    }


}
