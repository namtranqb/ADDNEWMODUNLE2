public class Test {

    public static void main(String[] args) {
        ExtendsSimple extendsSimple = new ExtendsSimple();


        ImplementsSimple implementsSimple = new ImplementsSimple();
        Thread thread1 = new Thread(implementsSimple);

        extendsSimple.start();
        thread1.start();
    }
}
