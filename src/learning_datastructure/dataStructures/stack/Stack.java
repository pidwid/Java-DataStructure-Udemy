package learning_datastructure.dataStructures.stack;

public class Stack {
    private int maxSize;
//    private long stackArray[];
    private char stackArray[];
    private int top;


    Stack(int size){
        this.maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char x){
        if (isFull()){
            System.out.println("Stack is full");
        }else {
            top++;
            stackArray[top] = x;
        }

    }

    public char pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return '0';
        }else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }

    }

    public char peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return maxSize-1 == top;
    }


}
