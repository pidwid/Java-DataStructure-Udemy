package learning_datastructures.ds.doublyLinkedList;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        this.first = newNode;

    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
        }
        last = newNode;
    }

    //assume nonempty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next != null) {
            first.next.previous = null;
        } else {
            last = null;
        }
        first = first.next;
        return temp;
    }

    //assume nonempty list
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    //assume nonempty list
    public boolean insertAfter(int key, int data) {
        Node currentNode = first;
        while (currentNode.data != key) {
            currentNode = currentNode.next;
            if (currentNode == null) {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;
        if (currentNode == last) {
            currentNode.next = null;
            last = newNode;
        } else {
            newNode.next = currentNode.next;
            currentNode.next.previous = newNode;
        }
        newNode.previous = currentNode;
        currentNode.next = newNode;
        return true;
    }

    //assume nonempty list
    public Node deleteKey(int key) {
        Node currentNode = first;
        while (currentNode.data != key) {
            currentNode = currentNode.next;
            if (currentNode == null) {
                return null;
            }
        }
        if (currentNode == first) {
            first = currentNode.next;
        } else {
            currentNode.previous.next = currentNode.next;
        }
        if (currentNode == last) {
            last = currentNode.previous;
        } else {
            currentNode.next.previous = currentNode.previous;
        }

        return currentNode;
    }

    public void displayForword() {
        System.out.println("first --> last");
        Node currentNode = first;
        while (currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }

    public void displayBackword() {
        System.out.println("first --> last");
        Node currentNode = last;
        while (currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.previous;
        }
    }
}
