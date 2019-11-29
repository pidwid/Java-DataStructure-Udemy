package learning_datastructures.ds.singlyLinkedList;


public class SinglyLinkedList {

    private Node first;
    private Node last;

        public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
//        Node temp;
        newNode.data = data;
        newNode.next = first;
        first = newNode;
//        temp = newNode;
//        while(temp.next != null){
//            temp = last;
//        }
//        last = temp;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("From first  ---> last");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int data){
        Node currentNode = first;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;
//        last = newNode;
    }
}
