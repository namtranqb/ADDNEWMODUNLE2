import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static boolean isPrimeLazy(int n){
        if(n < 2)
            return false;
        else
            for (int j = 2; j < n ; j++) {
                if(n%j==0)
                    return false;
            }
        return true;
    }

    public static boolean isPrimeOptimized(int n){
        if(n < 2)
            return false;
        else
            for (int j = 2; j <= Math.sqrt(n) ; j++) {
                if(n%j==0)
                    return false;
            }
        return true;
    }


    public static void main(String[] args) {
        Thread th1 = new Thread(new LazyPrime());
        Thread th2 = new Thread(new OptimizedPrime());


        th1.start();
        th2.start();
    }

}
