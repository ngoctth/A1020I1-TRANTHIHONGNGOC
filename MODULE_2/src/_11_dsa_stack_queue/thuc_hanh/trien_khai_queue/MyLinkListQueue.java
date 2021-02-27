package _11_dsa_stack_queue.thuc_hanh.trien_khai_queue;

public class MyLinkListQueue {
    private Node head;
    private Node tail;

    public MyLinkListQueue(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail==null){
            this.head=this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(int key) {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    public static void main(String[] args) {
//        MyLinkListQueue queue = new MyLinkListQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        System.out.println("Dequeued item is " + queue.dequeue().key);
    }


}
