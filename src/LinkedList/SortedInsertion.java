package LinkedList;

/**
 * Created by arpit on 6/28/17.
 */
public class SortedInsertion extends LinkedList {


    public static void main(String... args) {

        SortedInsertion insertion = new SortedInsertion();

        insertion.createSingleNode(4);

        insertion.traverseLinkedList("created List, 4 data");

        // insert node at first position
        insertion.addNodeInSortedOrder(new Node(2));

        insertion.traverseLinkedList("adding 2");

        insertion.addNodeInSortedOrder(new Node(3));

        insertion.traverseLinkedList("added 3");

        insertion.addNodeInSortedOrder(new Node(7));

        insertion.traverseLinkedList("added 7");

        insertion.head = null; // could be more better know

        insertion.traverseLinkedList("clear the list");

        insertion.addNodeInSortedOrder(new Node(10));

        insertion.traverseLinkedList("added first element");








    }
}
