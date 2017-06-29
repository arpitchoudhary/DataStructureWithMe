package LinkedList;

/**
 * Created by arpit on 6/29/17.
 */
public class ReverseList extends LinkedList {

    public static void main(String... args) {

        ReverseList reverseList = new ReverseList();

        reverseList.createSampleLinkedList(10, 12);
        reverseList.addNodeAtBeginning(new Node(15));
        reverseList.addNodeAtBeginning(new Node(20));

        reverseList.traverseLinkedList("Print the list");

        reverseList.reverseNode();

        reverseList.traverseLinkedList("After reversing");

        reverseList.head = null;

        //create a single node
        reverseList.createSingleNode(10);

        reverseList.reverseNode();
        reverseList.traverseLinkedList("Print");




    }
}
