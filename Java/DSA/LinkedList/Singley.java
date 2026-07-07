package DSA.LinkedList;

class Node {
    int data; // data field
    int data2;
    Node next; // address field

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    LinkedList() {
        // reference to the head to invoke empty list
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data); // new node

        newNode.next = head; // reference

        head = newNode; //

    }

    // insert
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next; // Traversal
        }
        temp.next = newNode;
    }

    // insert at postion
    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            System.out.println("Invalid Position");
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteFromBeggining() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty ");
        }
        if (head.next == null) {
            head = null;
        }
        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // reverse

    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = next;
        }
        head = prev;
    }

    // delete
    public void delete(int key) {
        Node temp = head; // first node

        Node prev = null; // next node

        // If key is found at the head
        if (temp != null && temp.data == key) {
            head = temp.next;

        }
        // search for key
        while (temp != null && temp.data != key) {
            // move the pointers / traversal
            prev = temp;
            temp = temp.next;

        }

        // If key not present
        if (temp == null)
            return;
        prev.next = temp.next;

    }

    // traversal
    public void Traverse() {
        Node current = head;

        while (current != null) {
            System.out.println("Current data: " + current.data);
            current = current.next;
        }

    }

}

public class Singley {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.Traverse();
        list.delete(20);
        list.Traverse();

    }

}