import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class taskService {
    public void removeTask(Queue<Task> taskQueue) {
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
     public void addTaskAndCompare(Queue<Task> taskQueue){
         Comparator<Task> comparator=Comparator.comparing(Task::getPriority).reversed().thenComparing(Task::getCreationSequence);

         PriorityQueue<Task> priorityQueue = new PriorityQueue<>(comparator);
        priorityQueue.addAll(taskQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
          }

    }
    public void peekNextTask(Queue<Task> taskQueue){
        if(!taskQueue.isEmpty())
            System.out.println(taskQueue.peek());
        else
            System.out.println("queue is empty");

    }

    public void boundedCapacity(Queue<Task> taskQueue){
        ArrayBlockingQueue<Task> arrayBlockingQueue = new ArrayBlockingQueue<>(5);
        for(Task task:taskQueue){
            if(arrayBlockingQueue.offer(task)){
                System.out.println("Added" +task);
            }
            else
                System.out.println("Queue is full! Cannot add task"+task);
        }
    }
}
