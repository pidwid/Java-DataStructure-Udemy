package learning_datastructures.ds.circularLinkedList;

public class App {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(20);
        circularLinkedList.insertFirst(30);
        circularLinkedList.insertFirst(40);
        circularLinkedList.insertLast(88888);
        circularLinkedList.insertFirst(70);
        circularLinkedList.insertFirst(80);
        circularLinkedList.insertLast(999999);
        circularLinkedList.displayList();
    }
}