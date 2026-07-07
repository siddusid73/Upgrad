package DSA.Queue;

class CircularQueueArr {
    int arr[];
    int front, rear, capacity;

    CircularQueueArr(int size) {
        arr = new int[size];
        capacity = size;
        front = rear;
    }

    void enque(int data) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = rear = 0;
            arr[rear] = data;
        } else {
            rear = (rear) % capacity;
            arr[rear] = data;
        }
    }

    int deque() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int data = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return data;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        while (i != rear) {
            System.out.println("Queue is empty");
            i = (i + 1) % capacity;
        }
        System.out.println(arr[rear] + "");
    }
}

public class QueueUsingCircularList {
    public static void main(String[] args) {
        CircularQueueArr cq = new CircularQueueArr(5);

        cq.enque(10);
        cq.enque(20);
        cq.enque(30);
        cq.display();
        System.out.println();
        cq.deque();
        cq.deque();
    }
}
