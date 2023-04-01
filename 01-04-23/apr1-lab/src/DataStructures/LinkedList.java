package DataStructures;

class LinkedList {
    private static class Node {
        public int val;
        public Node nextNode;

        Node(int val, Node nextNode) {
            this.val = val;
            this.nextNode = nextNode;
        }

        Node() {
        }

        Node(int val) {
            this.val = val;
        }
    }

    ;
    private Node head;

    LinkedList(Node top) {
        head = new Node(top.val, top.nextNode);
    }

    LinkedList() {
    }

    public boolean isempty() {
        return head == null;
    }

    public void push_back(int upToDate) {
        Node newNode = new Node(upToDate, null);
        Node temp = this.head;
        if (this.head != null) {
            Node back = new Node(this.head.val, this.head.nextNode);
            Node lastNode = new Node();
            lastNode = this.head;
            while (lastNode != null) {
                lastNode = lastNode.nextNode;
                Node NewNode = new Node();
            }

        } else {
            this.head = newNode;
        }
    }

    public void display() {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.nextNode;
        }
    }
}
