package LinkedList;

/**
 * Created by arpit on 6/28/17.
 */
public class SearchAndCountOperation extends LinkedList {


    public static void main(String... args) {

        SearchAndCountOperation operation = new SearchAndCountOperation();

        operation.createSampleLinkedList(10, 14);
        operation.addNodeInEnd(new Node(15));
        operation.addNodeInEnd(new Node(16));
        operation.addNodeInEnd(new Node(17));
        operation.addNodeInEnd(new Node(18));

        operation.traverseLinkedList("Print the list");

        System.out.println("Is Key value 15 found in the list? - " + operation.searchKey(15) + "");
        System.out.println("Is Key value 14 found in the list? - " + operation.searchKey(14) + "");
        System.out.println("Is Key value 19 found in the list? - " + operation.searchKey(19) + "");


        System.out.println("Total Elements in the list - " + operation.listLength() + "");


    }

}
