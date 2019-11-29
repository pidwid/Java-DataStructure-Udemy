package learning_datastructure.dataStructures.queue;

public class Queue {
    private int maxsize;
    private int front;
    private int rear;
    private long[] queueArray;
    int nItems;

    public Queue(int size) {
        this.maxsize = size;
        this.front = 0;
        this.rear = -1;
        this.queueArray = new long[size];
        this.nItems = 0;
    }

    public void insert(long data){
        if(rear == maxsize-1){
            rear = -1;
        }else {
            rear++;
            queueArray[rear] = data;
            nItems++;
        }    }

    public long remove(){
        long temp = queueArray[front];
        front++;
        if(front == maxsize) {
            front =0;
        }
            nItems--;
            return temp;
    }

    public long peekfront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems==maxsize);
    }

    public void view(){
        System.out.print(nItems + "[ ");

        for(int i=0;i<queueArray.length;i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.print(" ]");
    }

}
