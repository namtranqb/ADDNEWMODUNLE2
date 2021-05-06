import java.util.Scanner;
public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count day? ");
        int month = scanner.nextInt();
        String daysOfMonth;
        switch(month){
            case 2:
                daysOfMonth = ("28 or 29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = ("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysOfMonth = ("30");
                break;
            default:
                daysOfMonth = ("!");
                break;
        }
        if(daysOfMonth !="!") {
            System.out.printf("The month '%d' has %s days! ", month, daysOfMonth);
        }else{
            System.out.print("Invalid input!");
        }
    }
}