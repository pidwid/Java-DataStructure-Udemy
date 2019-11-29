package learning_datastructure.dataStructures.doublyLinkedList;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(30);
        doublyLinkedList.insertFirst(40);
        doublyLinkedList.insertLast(88888);
        doublyLinkedList.insertLast(77777);
        doublyLinkedList.insertLast(66666);
        doublyLinkedList.displayForword();
        doublyLinkedList.displayBackword();
        doublyLinkedList.insertFirst(70);
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteKey(40);
        doublyLinkedList.displayForword();
        doublyLinkedList.insertAfter(20,666);
        doublyLinkedList.insertFirst(80);
        doublyLinkedList.insertLast(999999);
        doublyLinkedList.displayForword();
    }
}
