package Week3.Day1;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        
        System.out.println("Linked List after inserting at end:");
        list.printList();  // Output: 10 -> 20 -> 30 -> null

        // Insert an element at the beginning
        list.insertAtBeginning(5);
        
        System.out.println("Linked List after inserting at beginning:");
        list.printList();  // Output: 5 -> 10 -> 20 -> 30 -> null

        // Delete a node with value 20
        list.deleteNode(20);
        
        System.out.println("Linked List after deleting node with value 20:");
        list.printList();  // Output: 5 -> 10 -> 30 -> null

        // Delete a node with value 5 (head)
        list.deleteNode(5);
        
        System.out.println("Linked List after deleting head node with value 5:");
        list.printList();  // Output: 10 -> 30 -> null
    }
}
