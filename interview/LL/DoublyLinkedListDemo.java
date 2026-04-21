// Node class
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Doubly LinkedList class
class DoublyLinkedList {
    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node by value
    void delete(int key) {
        if (head == null) return;

        Node temp = head;

        // If head is to be deleted
        if (temp.data == key) {
            head = temp.next;
            if (head != null) head.prev = null;
            return;
        }

        // Traverse and find node
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) return; // key not found

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display backward
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next; // go to last node
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

// Driver class
public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.displayForward();
        dll.displayBackward();

        dll.insertAtBeginning(5);
        dll.displayForward();

        dll.delete(20);
        dll.displayForward();
        dll.displayBackward();
    }
}
