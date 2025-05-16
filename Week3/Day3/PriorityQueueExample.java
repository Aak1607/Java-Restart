package Week3.Day3;

// PriorityQueueExample.java

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        
        taskQueue.add(new Task("Fix bugs", 3));
        taskQueue.add(new Task("Develop new feature", 5));
        taskQueue.add(new Task("Code review", 2));
        taskQueue.add(new Task("Team meeting", 4));

        System.out.println("Tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}

