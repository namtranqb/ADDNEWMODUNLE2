import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean leapYear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leapYear = true;
                }else{
                    leapYear = false;
                }
            }else{
                leapYear = true;
            }
        }else{
            leapYear = false;
        }
        if(leapYear){
            System.out.printf("%d is  a leap year",year);
        }else{
            System.out.printf("%d is NOT a leap year",year);
        }
    }
}
