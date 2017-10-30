package prac;

public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    /**
     * created the linked list with number of parameter passed.
     *
     * @param listOfDataValues
     */
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


    /**
     * method to add/append the linked list at the end.
     */
    public void appendList(Node node) {

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


    public void addAtFront(Node node) {

        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }


    /**
     * adding a node after a given node value, if value is not found then add in the end.
     */
    public void addNodeAfterGivenNodeValue(int addAfterValue, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        Node temp = head;
        while (temp != null) {

            if (temp.data == addAfterValue) {
                Node nextNode = temp.next;
                temp.next = newNode;
                newNode.next = nextNode;
                break;
            } else
                temp = temp.next;
        }

    }

    /**
     * method to add the node in sorted order
     */
    public void insertSortedNode(Node node) {

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        Node prevNode = null;
        boolean isFound = false;

        while (temp != null) {

            if (node.data < head.data) { // if data is less then head
                node.next = head;
                head = node;
                isFound = true;
                break;
            } else if (node.data < temp.data) { // if data is less then the current node
                prevNode.next = node;
                node.next = temp;
                isFound = true;
                break;
            } else {
                prevNode = temp;
                temp = temp.next;
            }

        }

        if (!isFound) {
            prevNode.next = node;
        }

    }

    /**
     * method for merge sort
     *
     * @return
     */
    public Node mergeSort(Node node) {

        if (node == null || node.next == null) {
            return node;
        }

        // first divide the list into two parts
        Node middle = getMiddle(node);
        Node nextMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(node);

        Node right = mergeSort(nextMiddle);

        Node sortedList = merge(left, right);

        return sortedList;
    }

    private Node merge(Node left, Node right) {

        Node result = null;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private Node getMiddle(Node node) {

        if (node == null) {
            return node;
        }

        Node fastFwd = node.next;
        Node slowNode = node;

        while (fastFwd != null) {

            fastFwd = fastFwd.next;
            if (fastFwd != null) {
                fastFwd = fastFwd.next;
                slowNode = slowNode.next;
            }

        }

        return slowNode;
    }

    /**
     * search the key if present in the list
     *
     * @param head
     * @param data
     * @return true
     */
    public boolean searchKeyInList(Node head, int data) {

        if (head == null) {
            return false;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }

        return false;

    }

    /**
     * method to reverse the list
     *
     * @param node
     */
    public void reverseLinkedList(Node node) {

        if (node == null) {
            return;
        }

        Node current = node;
        Node prev = null;
        Node curNext;

        while (current != null) {
            curNext = current.next;
            current.next = prev;
            prev = current;
            current = curNext;
        }

        head = prev;
    }


    public void reverseListOfGroup(Node node, int group) {

        if (node == null) {
            return;
        }

        Node current = node;
        Node prev = null;
        Node curNext;

        int count = 0;

        while (current != null) {

        }

    }

    /**
     * method to swap two nodes
     *
     * @param x
     * @param y
     */
    public void swapNode(Node head, int x, int y) {

        Node temp = head;
        Node nodeX = null, nodeY = null, swapTemp = null;

        while (temp != null) {
            if (temp.data == x) {
                nodeX = temp;
            }

            if (temp.data == y) {
                nodeY = temp;
            }

            temp = temp.next;
        }

        if (nodeX == null || nodeY == null) {
            return;
        }

        nodeX.data = nodeX.data + nodeY.data;
        nodeY.data = nodeX.data - nodeY.data;
        nodeX.data = nodeX.data - nodeY.data;
    }


    /**
     * delete a Node
     *
     * @param head
     * @param data
     */
    public void deleteANode(Node head, int data) {

        Node temp = head;
        Node slowNode = null;

        while (temp != null) {
            if (temp.data == data) {
                break;
            }
            slowNode = temp;
            temp = temp.next;
        }

        if (slowNode == null) {
            this.head = head.next;
            temp = null;
        } else {
            slowNode.next = temp.next;
            temp = null;
        }

    }


    public void deleteMiddleElementInList(Node head) {

        if (head == null) {
            System.out.print("list is empty");
            return;
        }

        if (head.next == null) {
            System.out.print("List is empty now");
            return;
        }

        Node temp = head, mid = head;
        Node slowNode = null;
        int count = 0;

        while (temp != null) {

            if (count % 2 == 1) {
                slowNode = mid;
                mid = mid.next;
            }

            count++;
            temp = temp.next;

        }

        slowNode.next = mid.next;
        mid = null;
    }


    /**
     * a, b, c, d, e, f, g -> rotate by 2
     * <p>
     * c, d, e, f, g, a, b
     *
     * @param head
     */
    public void rotateLinkedList(Node head, int rotateBy) {

        if (rotateBy < 1) {
            throw new IllegalArgumentException("rotate By can't be Zero or less");
        }

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        Node prevNode = null;
        int count = 0;
        while (temp.next != null) {

            if (count < rotateBy) {
                prevNode = temp;
                count++;
            }

            temp = temp.next;
        }

        Node newHead = prevNode.next;
        prevNode.next = null;
        temp.next = head;

        this.head = newHead;


    }

    public static void main(String... args) {

        LinkedList linkedList = new LinkedList();

        linkedList.createDefaultList(1, 3, 13, 7, 5);

        linkedList.traverseLinkedList();

        linkedList.appendList(new Node(6));

        System.out.println("Appending 6");

        linkedList.traverseLinkedList();

        System.out.println("adding 0 in the front");

        linkedList.addAtFront(new Node(0));

        linkedList.traverseLinkedList();

        System.out.println("adding 2 after 13");

        linkedList.addNodeAfterGivenNodeValue(13, 2);

        linkedList.traverseLinkedList();

        System.out.println("Lets create sorted LinkedList Now");


        // ================= Sorted List ========================
        LinkedList sortedList = new LinkedList();

        System.out.println("Perform Inseration Sort");

        for (int i = 0; i <= 4; i++) {

            sortedList.insertSortedNode(new Node((int) (Math.random() * 100)));

            sortedList.traverseLinkedList();
        }


        // ================= Merge List ========================
        LinkedList mergeSort = new LinkedList();

        System.out.println("Perform Merge Sort");

        mergeSort.createDefaultList(10, 230, 42, 232, 88, 234);

        mergeSort.traverseLinkedList();

        mergeSort.mergeSort(mergeSort.head);

        mergeSort.traverseLinkedList();

        System.out.println("Search 88 in the list ,  " + mergeSort.searchKeyInList(mergeSort.head, 88));

        System.out.println("Search 44 in the list ,  " + sortedList.searchKeyInList(sortedList.head, 44));

        System.out.println("Perform Reverse Sort");

        mergeSort.reverseLinkedList(mergeSort.head);

        mergeSort.traverseLinkedList();

        System.out.println("Perform Swap");

        // lets swap two nodes values
        mergeSort.swapNode(mergeSort.head, 232, 10);

        mergeSort.traverseLinkedList();

        System.out.println("Perform Deletion");

        LinkedList list = new LinkedList();
        list.createDefaultList(1, 4, 78, 43, 198, 32);
        list.traverseLinkedList();

        list.deleteANode(list.head, 1);
        list.traverseLinkedList();

        list.deleteANode(list.head, 32);
        list.traverseLinkedList();

        list.deleteANode(list.head, 43);
        list.traverseLinkedList();

        System.out.println("Delete Middle Element");

        mergeSort.traverseLinkedList();

        mergeSort.deleteMiddleElementInList(mergeSort.head);

        mergeSort.traverseLinkedList();

        System.out.println("Rotate linked list");

        mergeSort.rotateLinkedList(mergeSort.head, 2);
        mergeSort.traverseLinkedList();

        linkedList = null;

        sortedList = null;

        mergeSort = null;

        list = null;


    }

}
