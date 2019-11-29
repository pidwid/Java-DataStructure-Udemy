package learning_datastructure.dataStructures.linkedListExample;

public class App {
    public static void main(String[] args) {
        Node nodeA = new Node(4);
        Node nodeB = new Node(3);
        Node nodeC = new Node(7);
        Node nodeD = new Node(8);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
    }

    public static int listLength(Node aNode){
        int count = 0;
        Node current = aNode;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
