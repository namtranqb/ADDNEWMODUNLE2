public class ExtendsSimple extends Thread{

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("R_E >" + i);
        }

    }
}
