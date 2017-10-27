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

        do{

            System.out.print(temp.data +  "---->");
            temp = temp.next;

        }while(temp.next != head.next);

        //printing just to present that list is circular in nature.
        System.out.print(temp.data);
    }

    public static void main(String... args) {

        CircularList list = new CircularList();
        list.createDefaultList(1,2,3,4,5,6,7,8,9);
        list.traverseList();

    }
}
