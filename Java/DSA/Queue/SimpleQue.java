package DSA.Queue;

//Implementation queue using array
class SimpleQue1 {
    int arr[];
    int front, rear, capacity;

    SimpleQue1(int c) {
        this.capacity = c;
        arr = new int[c];
        front = 0;
        rear = -1;
    }

    // Enqueue

    void enque(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = data;
    }

    int deque() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front++];
    }

    int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        }
        for (int i = front; i <= rear; i++) {
            System.out.println("Elements inside the queue:" + arr[i]);
        }
    }
}
public class SimpleQue {
    public static void main(String[] args) {
        SimpleQue1 obj = new SimpleQue1(5);

        obj.enque(100);
        obj.enque(200);
        obj.enque(300);
        obj.enque(400);
        obj.enque(500);

        obj.deque();
        obj.peek();
        obj.display();
    }
}
