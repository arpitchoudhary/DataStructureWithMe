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
    public Node createSampleLinkedList(int num, int number) {

        this.head = new Node(num);
        Node second = new Node(number);
        head.next = second;

        return head;

    }

    /**
     * method to create the single node
     *
     * @param number
     * @return
     */
    public Node createSingleNode(int number) {
        this.head = new Node(number);
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
     *
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

    /**
     * find the key in the linked list
     *
     * @param key
     * @return
     */
    public boolean searchKey(int key) {
        Node temp = head;
        boolean isFound = false;
        while (temp.next != null) {
            if (temp.data == key) {
                isFound = true;
                break;
            } else {
                temp = temp.next;
            }
        }
        return isFound;
    }

    /**
     * return the number of element in the list
     *
     * @return
     */
    public int listLength() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            ++count;
            temp = temp.next;
        }
        return count;
    }


    /**
     * method to reverse the current list
     */
    public void reverseNode() {

        if (head == null) {
            System.exit(0);
        }

        Node current = head;
        Node prev = null;
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    /**
     * this is the method to merge two sorted list
     * @param first
     * @param second
     */
    public void mergeSortedLinkedLists(Node first, Node second){

    }

}
