package DSA.Queue;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}

class DequeLinkedList{
    Node front,rear;

    //Insert
    void insertFront(int data){
        Node newNode = new Node(data);

        if(front == null){
            //List is Empty
            front = rear = newNode;
            return;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    //Insert Rear
    void insertRear(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
    }

    //Delete Front
    int DeleteFront(){
        if(front==null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value =front.data;

        if(front == rear){
            //if only one node
            front = rear = null;;
        }else{
            front = front.next;
            front.prev = null;
        }
        return value;
    }

    //Delete Rear
    int DeleteRear(){
        if(rear == null){
            System.err.println("Queue is Empty");
            return -1;
        }
        int value = rear.data;

        if(rear == front){
            front = rear = null;
        }else{
            rear = rear.prev;
            rear.next = null;
        }
        return value;
    }

    void display(){
        Node temp = front;

        while(temp!=null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
    }
}

public class DoubleEndedQueList {
    public static void main(String[] args) {
        DequeLinkedList obj = new DequeLinkedList();

        obj.insertFront(10);
        obj.insertFront(20);
        obj.insertRear(30);
        obj.insertRear(40);

        obj.display();
        obj.DeleteFront();
        obj.display();
        obj.DeleteRear();
        obj.display();
    }
}
