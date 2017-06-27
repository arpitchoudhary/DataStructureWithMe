package LinkedList;

/**
 * Created by arpit on 6/28/17.
 */

/**
 * there will be three option to insert in the linkedList
 * Beginning
 * At Node
 * At End
 */
public class Insertion extends LinkedList {


    public static void main(String... args) {

        Insertion insertion = new Insertion();

        // create the list to work with
        insertion.createSampleLinkedList();

        // traverse the list
        insertion.traverseLinkedList();

        // adding at the beginning
        insertion.addNodeAtBeginning(new Node(0));

        // traverse the list
        insertion.traverseLinkedList();

        // node in the end
        insertion.addNodeInEnd(new Node(4));

        // traverse the list
        insertion.traverseLinkedList();

        // add node after node 2
        insertion.addNodeAtAnyPoint(4, new Node(3));

        // traverse the list
        insertion.traverseLinkedList();
    }

}
