
class Main {
    public static void main(String args[]) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.traversalSinglyLinkedList();
        sLL.createSinglyLinkedList(2);
        sLL.insertInSinglyLinkedList(2, 6);
        sLL.insertInSinglyLinkedList(1, 1);
        sLL.insertInSinglyLinkedList(3, 3);
        sLL.insertInSinglyLinkedList(4, 5);
        sLL.insertInSinglyLinkedList(5, 3);
        sLL.traversalSinglyLinkedList();
        // sLL.searchSinglyLinkedList(5);
        // sLL.searchSinglyLinkedList(9);
        sLL.deleteNodeFromSinglyLinkedList(1);
        sLL.traversalSinglyLinkedList();
        sLL.deleteNodeFromSinglyLinkedList(8);
        sLL.traversalSinglyLinkedList();
        sLL.deleteNodeFromSinglyLinkedList(3);
        sLL.traversalSinglyLinkedList();

    }
}
