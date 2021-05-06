import java.util.Random;

public class MiniGame{
    public static int random(){
        Random r1 = new Random();
        int rdNum = r1.nextInt(1000)+10;
        return rdNum;
    }

    public static int random1(){
        Random r1 = new Random();
        return r1.nextInt(10)+1;

    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new Th1());
        Thread t2 = new Thread(new Th2());
        Thread t3 = new Thread(new Th3());
        t1.setPriority(1);
        t2.setPriority(6);
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();

    }


}
