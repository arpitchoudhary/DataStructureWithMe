package LinkedList;

/**
 * Created by achoudhary on 6/28/17.
 */
public class SearchOperation extends LinkedList {


    public static void main(String... args) {

        SearchOperation operation = new SearchOperation();

        operation.createSampleLinkedList(10, 14);
        operation.addNodeInEnd(new Node(15));
        operation.addNodeInEnd(new Node(16));
        operation.addNodeInEnd(new Node(17));
        operation.addNodeInEnd(new Node(18));


        System.out.println("Is Key value 15 found in the list? - " + operation.searchKey(15) + "");
        System.out.println("Is Key value 14 found in the list? - " + operation.searchKey(14) + "");
        System.out.println("Is Key value 19 found in the list? - " + operation.searchKey(19) + "");

    }

}
