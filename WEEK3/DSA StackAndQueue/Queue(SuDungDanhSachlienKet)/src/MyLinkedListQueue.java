public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void enqueue(int value){
        Node temp = new Node(value);
        if(this.tail == null){
            this.head = this.tail = temp;
        }
        this.tail.next = temp;
        this.tail = temp;
    }


    public Node dequeue(){
        if(this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    public static void main(String[] args) {
        MyLinkedListQueue q = new MyLinkedListQueue();
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("head: "+q.head.value);
        System.out.println("tail: "+q.tail.value);
        q.dequeue();
        System.out.println("dequeue: "+q.head.value);



    }
}
