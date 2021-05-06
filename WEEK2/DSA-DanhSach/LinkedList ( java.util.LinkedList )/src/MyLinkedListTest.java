import java.util.Arrays;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> demo = new MyLinkedList<>();
        demo.addFirst(20);
        demo.addFirst(10);
        demo.add(0,00);
        demo.add(3,30);
        demo.add(4,40);
        demo.addLast(50);
        demo.printList();
//        System.out.println("\n************");
//        demo.remove(5);
//        demo.printList();
//        System.out.println("\n************");
//        demo.removeData(50);
//        demo.printList();
//        System.out.println("\n************");
//        demo.removeData(60);
//        demo.printList();
        demo.clone();
    }
}
