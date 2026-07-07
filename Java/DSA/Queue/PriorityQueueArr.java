package DSA.Queue;

class PriorityQueArr {
    class Item {
        int data;
        int priority;

        Item(int data, int p) {
            this.data = data;
            this.priority = p;
        }
    }

    Item[] arr;
    int size;
    int capacity;

    PriorityQueArr(int c) {
        arr = new Item[c];
        capacity = c; // max elements
        size = 0; // counter variable to count number of elements inside array
    }

    void enqueue(int data, int p) {
        if (size == capacity - 1) {
            System.out.println("Queue Overflow");
        }
        arr[size++] = new Item(data, p);
    }

    int dequeue() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int highest = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i].priority > arr[highest].priority) {
                highest = i;
            }
        }
        int value = arr[highest].data;

        for (int i = highest; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        return value;

    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Data: " + arr[i].data + "Priority: " + arr[i].priority);
        }
    }

}

public class PriorityQueueArr {
    public static void main(String[] args) {

    }
}
