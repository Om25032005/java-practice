class Queue {
    int front, rear, size;
    int capacity;
    int[] arr;

    // Constructor
    Queue(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    // Check if queue is full
    boolean isFull() {
        return size == capacity;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Enqueue
    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Dequeue
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Front element
    int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    // Rear element
    int rear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[rear];
    }
}

public class QueueArr {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.front());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Rear element: " + queue.rear());
    }
}
