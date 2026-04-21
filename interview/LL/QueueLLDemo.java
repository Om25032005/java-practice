// Node class for LinkedList
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class
class QueueLL {
    private Node front, rear;

    QueueLL() {
        this.front = this.rear = null;
    }

    // Enqueue (add element at rear)
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            System.out.println(data + " enqueued to queue");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue (remove element from front)
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeued = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return dequeued;
    }

    // Peek front element
    int peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Check if empty
    boolean isEmpty() {
        return front == null;
    }
}

// Driver class
public class QueueLLDemo {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue Empty? " + queue.isEmpty());
    }
}
