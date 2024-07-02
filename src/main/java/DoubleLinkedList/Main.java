package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // Create a Dll
        doublyLinkedList.createDLL(1);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);

        // Traverse
        System.out.println("Traverse DLL:");
        doublyLinkedList.traverseDLL();

        // Reverse traverse
        System.out.println("Reverse Traverse DLL:");
        doublyLinkedList.reverseTraverseDLL();

        // Find node
        System.out.println("Search for node with value 2:");
        boolean isFound = doublyLinkedList.searchDLL(2);
        System.out.println("Node found: " + isFound);

        // Delete node
        System.out.println("Delete node at position 1:");
        doublyLinkedList.deleteNodeDLL(1);
        doublyLinkedList.traverseDLL();

        // Delete all DLL
        System.out.println("Delete entire DLL:");
        doublyLinkedList.deleteDLL();
        doublyLinkedList.traverseDLL();
    }
}
