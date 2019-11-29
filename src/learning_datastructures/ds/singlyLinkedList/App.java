package ds.singlyLinkedList;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(20);
        singlyLinkedList.insertFirst(30);
        singlyLinkedList.insertFirst(40);
        singlyLinkedList.insertLast(88888);
        singlyLinkedList.insertFirst(70);
        singlyLinkedList.insertFirst(80);
        singlyLinkedList.insertLast(999999);
        singlyLinkedList.displayList();
    }
}
