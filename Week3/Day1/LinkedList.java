package Week3.Day1;

class LinkedList {
    Node head; // Head of the list

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to the current head
        head = newNode;      // Update head to the new node
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make newNode the head
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Traverse to the end of the list
        }
        current.next = newNode; // Link the last node to the new node
    }

    // Delete a node with a specific key
    public void deleteNode(int key) {
        Node current = head, prev = null;

        // If head node itself holds the key to be deleted
        if (current != null && current.data == key) {
            head = current.next; // Change head
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If key was not present in linked list
        if (current == null) return;

        // Unlink the node from linked list
        prev.next = current.next;
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
