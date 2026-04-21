// Node class for LinkedList
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class StackLL {
    private Node top;

    StackLL() {
        this.top = null;
    }

    // Push element
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    }

    // Pop element
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek element
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Check if empty
    boolean isEmpty() {
        return top == null;
    }
}

// Driver class
public class StackLLDemo {
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack Empty? " + stack.isEmpty());
    }
}
