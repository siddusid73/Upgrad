package DSA.Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedQueue {

    Node front;
    Node rear;

    LinkedQueue() {
        front = null;
        rear = null;
    }

    void enque(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int deque() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int deletedValue = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return deletedValue;
    }

    int peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.println("Element in the Queue" + temp.data);
            temp = temp.next;
        }
    }
}

public class QueueUsingLinkedlist {
    public static void main(String[] args) {
        LinkedQueue obj = new LinkedQueue();

        obj.enque(10);
        obj.enque(20);
        obj.enque(30);
        obj.enque(40);
        obj.enque(50);

        System.out.println("Deleted element:"+obj.deque());
        System.out.println("Front element:"+obj.peek());

        obj.display();
    }
}
