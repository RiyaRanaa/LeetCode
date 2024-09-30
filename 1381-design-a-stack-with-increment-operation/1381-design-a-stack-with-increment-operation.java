import java.io.*;
import java.util.*;

class CustomStack {

    private int arr[];
    private int top;
    private int capacity;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        capacity = maxSize;
        top = -1;
    }
    
    public void push(int x) {
        top++;
        if (top <= capacity - 1){
            arr[top] = x;
        }
        else{
            top--;
        }
    }
    
    public int pop() {
        if (top == -1){
            return -1;
        }
        int item = arr[top];
        top--;
        return item;
    }
    
    public void increment(int k, int val) {
        for(int i = 0;i < k && i < arr.length;i++){
            arr[i] = arr[i] + val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */