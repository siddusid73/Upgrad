package DSA.Stack;


class StackArr{
    int arr[];
    int top;
    int capacity; // capacity

    StackArr(int s){
        this.capacity = s;
        arr = new int[s];
        top = -1;
    }

    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack Full");
            return;
        }
        arr[++top] = data; // insert after incrementing top
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];

    }
    int peek(){
        if(top ==-1){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    int size(){
        if(top==-1){
            System.out.println("No Elements in Stack");
        }
        return top+1;
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.println("Elements: "+arr[i]);
        }
    }


}

public class Stack{
    public static void main(String[] args) {
        
    }
    
}
