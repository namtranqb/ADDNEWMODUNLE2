public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        MyList<Integer> newList = new MyList<Integer>();

        myList.add(12);
        myList.add(13);
        myList.add(14);
        myList.add(15);
        myList.add(16);
        myList.add(17);
        myList.add(18);
        myList.printList();
//        System.out.println("\n********");
//        myList.add(2,21);
//        myList.printList();
        System.out.println("\n********");
        newList.clone();
    }
}

