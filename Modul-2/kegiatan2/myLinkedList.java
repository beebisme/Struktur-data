package kegiatan2;

public class myLinkedList {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else if (data < head.getValue()) {
            head.setNext(head);
            head = newNode;
        } else {
            Node current = head;

            while (current.getNext() != null && data > current.next.getValue()) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.getNext();
        }
    }

    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
