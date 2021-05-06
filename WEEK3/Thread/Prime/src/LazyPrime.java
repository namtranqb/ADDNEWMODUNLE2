public class LazyPrime implements Runnable{



    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            if(Main.isPrimeLazy(i))
                System.out.println("Lazy: "+i);

        }
        System.out.println("Lazy finish !");
    }
}
