package DSA.Sorting;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class BubbleDoublylist {
    Node head;

    // method to add new node at the end
    void append(int data) {
        Node newNode = new Node(data);

        if (head == newNode) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    // method to perform bubble sort
    void bubblesort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swap;
        Node current;

        do {
            swap = false;
            current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // swap cuurent node to next node
                    int tempVal = current.data;
                    current.data = current.next.data;
                    current.next.data = tempVal;

                    swap = true;
                }
                // Always move to the next node to avoid infinite loops
                current = current.next;
            }
        } while (swap);
    }

    void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleDoublylist obj = new BubbleDoublylist();

        obj.append(100);
        obj.append(200);
        obj.append(300);
        obj.append(400);

        System.out.println("Original Doubly linked list: ");
        obj.printList();
        obj.bubblesort();
        System.out.println("Sorted Doubly linked list: ");
        obj.printList();
    }
}
