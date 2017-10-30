package prac;

public class CircularList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
            temp = temp.next;
            temp.next = head;
        }

    }


    public void traverseList() {

        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;

        do {

            System.out.print(temp.data + "---->");
            temp = temp.next;

        } while (temp.next != head.next);

        //printing just to present that list is circular in nature.
        System.out.print(temp.data);

    }

    /**
     * split the method into two halfs
     */
    public void splitListIntoHalf(Node head) {

        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        if (head.next == head) {
            System.out.println("List Can't be half.");
            return;
        }

        if (head.next.next == head) {
            System.out.println("First Half " + head.data);
            System.out.println("Second Half " + head.next.data);
            return;
        }

        Node temp = head.next;
        int count = 0;
        Node mid = head;

        while (temp.next != head.next) {
            if (count % 2 == 1) {
                mid = mid.next;
            }
            count++;
            temp = temp.next;
        }

        System.out.println("Middle Node is " + mid.data);

    }

//    public void sortedInsert(int data) {
//
//        Node newNode = new Node(data);
//        Node temp = head;
//
//        // if its a first node
//        if(head == null){
//            newNode.next = newNode;
//            head = newNode;
//            return;
//        }
//
//        if(data <= temp.data){
//
//            while(temp.next != head){
//                temp = temp.next;
//            }
//
//            temp.next = newNode;
//            newNode.next = head;
//        } else {
//
//            while (temp.next != head &&
//                    temp.next.data < newNode.data)
//                temp = temp.next;
//
//            newNode.next = temp.next;
//            temp.next = newNode;
//
//        }
//
//    }


    public static void main(String... args) {

        CircularList list = new CircularList();
        list.createDefaultList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.traverseList();

        System.out.println(" ");
//        System.out.println("Sorted Order");

       // list.head = null;
//        for (int i = 0; i < 5; i++) {
//            //   list.sortedInsert((int) (Math.random() * 100));
//        }

//        list.traverseList();
        list.splitListIntoHalf(list.head);

    }
}
