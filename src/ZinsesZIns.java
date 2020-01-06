
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ZinsesZIns {
    public static void main(String[] args) {

        double Rendite,einzahlen, Jahre;
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viel  Euro möchtest du einzahlen ? ");
         einzahlen = input.nextDouble();
        System.out.println("Wie viel Rendite bekommst du ? Geben sie in % an");
        Rendite = input.nextDouble();
        Rendite = Rendite/100;
        System.out.println("Wie viele Jahre möchtest du dein Geld verzinsen ? ");
        Jahre = input.nextDouble();
        double einzahlen1 = 0;
        double ges;
        double grundwert = einzahlen;
        System.out.println("Wie viel geld möchtest du Haben ? ");
        double mochtegeld = input.nextDouble();
        int i =0;
        while (true) {
            double singlerendite = einzahlen * Rendite;
            einzahlen1 += singlerendite+einzahlen;
            einzahlen = einzahlen1;
            einzahlen1 = 0;
            i +=1;
            double plusrendite = einzahlen-grundwert;
            if (mochtegeld<=einzahlen){
                double gesgeld = grundwert+plusrendite;
                System.out.printf("Es hat %d Jahre gedauert um %f Geld zu bekommen",i,gesgeld);
                break;
            }
            System.out.printf(" Nach dem %d Jahr hast du  %f €  das heißt du hast %f € mehr  als zuvor \n",i,einzahlen,plusrendite);
        }

    }


}
