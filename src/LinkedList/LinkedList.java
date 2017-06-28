package LinkedList;

/**
 * Created by arpit on 6/27/17.
 */
public class LinkedList {

    Node head;

    /**
     * sample node class
     */
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }


    /**
     * method to traverse the linkedList
     */
    public void traverseLinkedList(String message) {

        System.out.println(message);
        System.out.println("=========================");

        Node node = this.head;
        while (node != null) {
            System.out.print("|---- " + node.data + " -----|");
            node = node.next;
        }

        System.out.println();
        System.out.println();

    }

    /**
     * method to create a list of 2 node
     */
    public Node createSampleLinkedList(int number1, int number2) {

        this.head = new Node(number1);
        Node second = new Node(number2);
        head.next = second;

        return head;

    }

    public Node createSingleNode(int number1) {
        this.head = new Node(number1);
        return head;
    }

    /**
     * method that will add the node at the beginning
     *
     * @param node
     */
    public void addNodeAtBeginning(Node node) {
        node.next = head;
        this.head = node;
    }


    /**
     * method that will add the node in the end
     *
     * @param node
     */
    public void addNodeInEnd(Node node) {

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

    }

    /**
     * method to add node at any location
     *
     * @param position
     * @param node
     */
    public void addNodeAtAnyPoint(int position, Node node) {

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        int pos = 0;
        boolean isAdd = false;

        while (temp.next != null) {

            if (pos == position) {
                node.next = temp.next;
                temp.next = node;
                isAdd = true;
                break;
            }
            pos++;
            temp = temp.next;

        }

        if (!isAdd) {
            temp.next = node;
        }

    }

    /**
     * Insertion in sorted order Linked List
     * @param node
     */
    public void addNodeInSortedOrder(Node node) {

        if (head == null || node.data < head.data) {
            node.next = head;
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data < node.data) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
    }
}
