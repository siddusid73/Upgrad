package DSA.Stack;
// Stack implementation using linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class StackList {
    Node top;
    int size;
    int capacity; // max number of elements list can have

    StackList(int c) {
        this.capacity = c;
        size = 0;
        top = null;
    }

    public void push(int data) {
        if (size == capacity) {
            System.out.println("Stack overflow");
            return;
        }
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;

        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class StackinList {
    public static void main(String[] args) {
        StackList obj = new StackList(5);

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);

        obj.display();

        obj.pop();

        obj.display();

        obj.isEmpty();

        obj.display();
    }
}
