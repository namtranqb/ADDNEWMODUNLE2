

public class Th3 implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("C read: "+ MiniGame.random1());

            try {
                Thread.sleep(MiniGame.random());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("C finish");
    }
}
