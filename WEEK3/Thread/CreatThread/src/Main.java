import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start:");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" running.....");
            }
        });
        t1.start();


        // CACH 2 lambda
        new Thread(()->{
            System.out.println("run run run");
        }).start();


        // Cach 3

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run run ....");
            }
        }).start();


        System.out.println("End");
    }
}
