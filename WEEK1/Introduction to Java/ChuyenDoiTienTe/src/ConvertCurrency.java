import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Input USD:");
        double USD = scanner.nextDouble();
        double VND = USD * rate;
        System.out.print("convert:"+VND);

    }
}
