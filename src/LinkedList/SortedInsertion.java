package LinkedList;

/**
 * Created by arpit on 6/28/17.
 */
public class SortedInsertion extends LinkedList {


    public static void main(String... args) {

        SortedInsertion insertion = new SortedInsertion();
        insertion.createSampleLinkedList(0, 1);

        insertion.addNodeInSortedOrder(new Node(4));

    }
}
