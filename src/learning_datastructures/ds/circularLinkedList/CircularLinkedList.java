package ds.circularLinkedList;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public boolean isEmpty(){
        return  first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void displayList(){
        System.out.println("first --> last");
        Node currentNode;
        currentNode = first;
        while (currentNode != null){
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }

    public int deleteFirst(){
        int temp = first.data;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void insertLast(int data){
        Node currentNode = new Node();
        currentNode.data = data;
        if(isEmpty()){
            first = currentNode;
        }else {
        last.next = currentNode;
        last = currentNode;
    }}


}
