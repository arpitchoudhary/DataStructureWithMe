package prac;

public class DoubleLinkedList {

    Node head;

    static class Node {

        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public void createDefaultList(int... listOfDataValues) {

        if (listOfDataValues.length == 0) {
            System.out.println("Can't create empty list");
            System.exit(0);
        }

        head = new Node(listOfDataValues[0]);
        Node temp = head;


        for (int i = 1; i < listOfDataValues.length; i++) {
            Node node = new Node(listOfDataValues[i]);
            temp.next = node;
            node.prev = temp;
            temp = temp.next;
        }

    }

    /**
     * traversed the linked list
     */
    public void traverseLinkedList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();

    }

    public void insertAtFront(int data) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = new Node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;

    }


    public static void main(String... args) {

        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.createDefaultList(45, 3, 5, 46, 23, 12, 52);
        linkedList.traverseLinkedList();

        System.out.println("Insert at Front");
        linkedList.insertAtFront(23);
        linkedList.traverseLinkedList();
    }
}
