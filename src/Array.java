public class Array {
    public static void main(String[] args) {
        int[] grades = new int[4];
        grades[0] = 77;
        grades[1] = 84;
        grades[2] = 80;
        grades[3] = 96;
        double sum = 0.0;
        String[] students = new String[]{"Tom","Ed","Joe","Bob"};
        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");
        for (int i=0;i<grades.length;i++) {
            System.out.printf("%d\t%s\t%d\n",i,students[i],grades[i]);
            sum += grades[i]; }
            double avereage = sum/grades.length;
        System.out.printf("Class Avvereage %f \n",avereage);
    }
}
