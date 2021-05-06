import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        double money = 1.0;
        int month;
        double rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        rate = sc.nextDouble();
        double total = 0;
        for(int i = 0;i< month;i++){
            total += money*(rate/100)/12*month;
        }
        System.out.println("Total of interest:"+total);
    }
}
