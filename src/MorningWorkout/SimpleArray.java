package MorningWorkout;

import com.sun.media.jfxmediaimpl.HostUtils;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Random;

public class SimpleArray {
    public static void main(String[] args) {
        // grades Names Ausgabe
        Random generator = new Random();
        int[] grades = new int[4];

        grades[0] = generator.nextInt(100)+1;
        grades[1] = generator.nextInt(100)+1;
        grades[2] = generator.nextInt(100)+1;
        grades[3] = generator.nextInt(100)+1;
        String[] names = new String[]{"Tom","Fin","Tobi","Klaus"};

        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");

        for (int i = 0; i<grades.length;i++){
            System.out.printf("%d \t %s\t %d \n",i,names[i],grades[i]);
        }
    }

}
