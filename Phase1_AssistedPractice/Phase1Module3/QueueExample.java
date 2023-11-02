package Phase1Module3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements to the queue
        queue.offer(50);
        queue.offer(20);
        queue.offer(80);
        queue.offer(90);
        
        // Remove and retrieve element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        
        // Retrieve the front element without removing
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);
    }
}
