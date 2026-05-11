// Node class
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {

    Node head;

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
    }

    // Insert at beginning
    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    // Delete a node by value
    void delete(int key) {

        if (head == null)
            return; 

        // If head node is to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        // If key found
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Reverse Linked List
    void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        head = prev;
    }

    // Display the list
    void display() {

        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Driver class
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Original List:");
        list.display();

        list.insertAtBeginning(5);

        System.out.println("After Inserting at Beginning:");
        list.display();

        list.delete(20);

        System.out.println("After Deleting 20:");
        list.display();

        list.reverse();

        System.out.println("After Reversing:");
        list.display();
    }
}