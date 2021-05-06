public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(34);
        ll.addFirst(21);
        System.out.println("List 1:");
        ll.printList();


        ll.add(2,10);
        System.out.println("\nList 2 (add: '10' at index:'2')");
        ll.printList();

        ll.add(4,5);
        System.out.println("\nList 3 (add:'5' at index: '4')");
        ll.printList();
    }
}
