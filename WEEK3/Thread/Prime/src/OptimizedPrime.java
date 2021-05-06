public class OptimizedPrime implements Runnable {



    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            if(Main.isPrimeOptimized(i))
                System.out.println("Optimized: "+i);

        }
        System.out.println("Optimized finish !");
    }
}
