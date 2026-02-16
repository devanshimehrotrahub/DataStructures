public class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;

    public int size = 0;

    // creation
    public void createSinglyLinkedList(int value) {
        Node newNode = new Node();
        newNode.val = value;
        newNode.next = null;

        head = newNode;
        tail = newNode;

        size = 1;

    }

    // insertion
    public void insertInSinglyLinkedList(int value, int position) {
        Node newNode = new Node();
        newNode.val = value;
        newNode.next = null;

        if (head == null) {
            createSinglyLinkedList(value);
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
            size++;
        } else if (position >= size + 1) {
            tail.next = newNode;
            tail = newNode;
            size++;
        } else {
            int i = 1;
            Node p = head;
            while (i < position - 1) {
                p = p.next;
                i++;
            }
            newNode.next = p.next;
            p.next = newNode;
            size++;
        }
    }

    // traversal

    public void traversalSinglyLinkedList() {
        System.out.println();
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else {
            Node t = head;
            while (t != null) {
                System.out.print(t.val);
                if (t != tail) {
                    System.out.print(" -> ");
                }
                t = t.next;
            }

        }

    }

    // search
    public void searchSinglyLinkedList(int value) {
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else {
            Node t = head;
            int i = 1;

            while (t != null) {
                if (t.val == value) {
                    System.out.println("The value is found at position " + i);
                    return;
                }
                t = t.next;
                i++;
            }
            System.out.println("Value not found in the linked list");

        }
    }

    // deletion
    public void deleteNodeFromSinglyLinkedList(int position) {
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else if (position == 1) {
            head = head.next;
            size--;
            if (size == 0) {
                head = tail = null;
            }
        } else if (position >= size) {
            Node t = head;
            for (int i = 1; i < size - 1; i++) {
                t = t.next;
            }
            t.next = null;
            tail = t;
            size--;
        } else {
            Node t = head;
            int i = 1;
            while (i < position - 1) {
                t = t.next;
                i++;
            }
            t.next = t.next.next;
            size--;

        }

    }

    // deletion of entire linked list
    public void deleteSinglyLinkedList() {
        {
            head = tail = null;
            size = 0;
            System.out.println("The linked list has been deleted successfully");
        }

    }
}
