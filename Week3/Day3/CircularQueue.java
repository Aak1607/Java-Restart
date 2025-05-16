package Week3.Day3;

/*  A Circular Queue overcomes the limitation of a regular queue where you can't reuse space even if the queue is 
partially empty. Here’s a simple implementation*/

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = capacity;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = queue[front];
        if (front == rear) {
            // Queue is empty after this dequeue
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println("Dequeued: " + value);
        return value;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.printQueue();  // Queue: 10 20 30 40

        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);  // Should wrap around
        queue.printQueue();  // Queue: 30 40 50 60 70
    }
}
