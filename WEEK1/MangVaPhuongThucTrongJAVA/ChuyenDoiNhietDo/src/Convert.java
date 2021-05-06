import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Celsius To Fahrenheit:");
            System.out.println("2. Fahrenheit To Celsius:");
            System.out.println("0. Exit");
            System.out.println("Choice:");
            choice = sc.nextInt();
            switch (choice){
                case  1: {
                    System.out.println("Input Celsius:");
                    float celcius = sc.nextFloat();
                    System.out.println("Fahrenheit: "+celsiusToFahrenheit(celcius));
                    break;
                }
                case 2:{
                    System.out.println("Input Fahrenheit:");
                    float fahrenheit = sc.nextFloat();
                    System.out.println("Celsius: "+fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 0:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Please Choice !");
                    break;
                }
            }
        }while (choice != 0);
    }
    public static float celsiusToFahrenheit(float celsius){
        float fahrenheit =(float) (9.0/5)* celsius + 32;
        return fahrenheit;
    }
    public static float fahrenheitToCelsius(float fahrenheit ){
        float celsius = (float) (5.0/9)*(fahrenheit - 32);
        return celsius;
    }
}
