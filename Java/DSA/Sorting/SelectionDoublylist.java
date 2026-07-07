package DSA.Sorting;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class SelectionDoublylist {
    Node head;
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

    void selectionSort(){
        if(head == null || head.next == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            Node minNode = current;
            Node temp = current.next;

            //find the minimun node
            while(temp !=null){
                if(temp.data<minNode.data){
                    minNode = temp;
                }
                temp = temp.next;
            }
            
            //swap data of current and minNode
            int tempData = current.data;
            current.data = minNode.data;
            minNode.data = tempData;
            current = current.next;
        }

    }
    //print list
    void printList(){
        Node current  = head;
        while(current != head){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionDoublylist obj = new SelectionDoublylist();

        obj.append(312);
        obj.append(413);
        obj.append(23);
        obj.append(431);
        obj.append(32);

        System.out.println("Unsorted List:");
        obj.printList();
        obj.selectionSort();
        System.out.println("Sorted List:");
        obj.printList();
    }
}
