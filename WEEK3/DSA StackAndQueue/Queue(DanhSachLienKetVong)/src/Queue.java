public class Queue<E> {
    public Node front;
    public Node rear;


    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }
}
