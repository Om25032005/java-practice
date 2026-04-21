// Node class
class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

// Deque class using Doubly Linked List
class Deque {
    Node front, rear;

    Deque() {
        front = rear = null;
    }

    // Check if empty
    boolean isEmpty() {
        return front == null;
    }

    // Insert at front
    void insertFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        System.out.println(data + " inserted at front");
    }

    // Insert at rear
    void insertRear(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        System.out.println(data + " inserted at rear");
    }

    // Delete from front
    int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front != null) front.prev = null;
        else rear = null; // if list becomes empty
        return val;
    }

    // Delete from rear
    int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque Underflow");
            return -1;
        }
        int val = rear.data;
        rear = rear.prev;
        if (rear != null) rear.next = null;
        else front = null; // if list becomes empty
        return val;
    }

    // Get front element
    int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }
        return front.data;
    }

    // Get rear element
    int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return -1;
        }
        return rear.data;
    }

    // Display Deque (forward)
    void display() {
        if (isEmpty()) {
            System.out.println("Deque is Empty");
            return;
        }
        Node temp = front;
        System.out.print("Deque: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Driver class
public class DequeDemo {
    public static void main(String[] args) {
        Deque dq = new Deque();

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertRear(30);
        dq.display();

        System.out.println("Front element: " + dq.getFront());
        System.out.println("Rear element: " + dq.getRear());

        System.out.println("Deleted from front: " + dq.deleteFront());
        dq.display();

        System.out.println("Deleted from rear: " + dq.deleteRear());
        dq.display();
    }
}
