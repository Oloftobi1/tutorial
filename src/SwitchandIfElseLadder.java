import java.util.Scanner;

public class SwitchandIfElseLadder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is The day your Birthed");
        int  day = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is your Birth month");
        int  month= input.nextInt();
        System.out.printf("Your birthday is the %s of %s",getDayName(day),getMonthName(month));
    }
    public static String getMonthName(int month){

        String result = "Unknown";
        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "Febuary";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "Oktober";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        return result;
    }
    public static String getDayName(int day){
        String result;
        if (day != 11 && day%10 == 1){
            result = day + "st";
        }
        else if (day != 12 && day%10 ==2){
            result = day + "nd";
        }
        else if (day !=13 && day%10 == 3){
            result = day +"rd";
        }
        else{
            result = "th";
        }
        return  result;
    }
}
