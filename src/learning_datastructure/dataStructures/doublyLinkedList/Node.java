package learning_datastructure.dataStructures.doublyLinkedList;

public class Node {
    public int data;
    public Node next;
    public Node previous;

    public void displayNode(){
        System.out.print("{" + data + "}");
    }
}
