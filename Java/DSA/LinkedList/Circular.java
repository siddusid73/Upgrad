package DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void createList() {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head = first;

        first.next = second;
        second.next = third;
        third.next = head; // Circular list

    }

    // Insertion
    public void insertAtBeggining(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // At the End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // At the Postion
    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from Beggining
    public void deleteFromBeggining() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            head = null;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current.next != head) {
            prev = current;
            current = current.next;
        }
        prev.next = head;
    }

    public void deleteAtPos(int pos) {
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;

        do {
            System.out.println(temp.data + "");
            temp = temp.next;
        } while (temp != head);
    }

}

public class Circular {
    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();

        obj.insertAtBeggining(100);
        obj.insertAtEnd(200);
        obj.insertAtPos(500, 4);

        obj.deleteFromBeggining();
        obj.deleteAtEnd();
        obj.deleteAtPos(3);

        obj.display();
    }
}
