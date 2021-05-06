import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("input number:");
        number =sc.nextInt();
        int count = 0;
        String primeList ="";
            for(int n = 1;count <number;n++){
                int check = 0;
                for(int i = n;i >= 1;i--){
                    if(n%i==0){
                       check++;
                    }
                }if(check ==2){
                    primeList += n +" ";
                    count ++;
                }
            }
        System.out.println(number+" Primes list: ");
        System.out.println(primeList);
    }
}

