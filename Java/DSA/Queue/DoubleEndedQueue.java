package DSA.Queue;

class DoubleEndedQueueArr{
    int arr[];
    int front,rear,capacity;

    DoubleEndedQueueArr(int c){
        this.capacity = c;
        arr = new int[c];
        front = rear = -1;
    }
    boolean isFull(){
        return(front==(rear+1));
    }
}

public class DoubleEndedQueue {
    
}
