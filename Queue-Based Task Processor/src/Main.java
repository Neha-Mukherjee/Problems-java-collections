import java.util.ArrayDeque;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Task> taskQueue = new ArrayDeque<>();
        taskQueue.offer(new Task(101L, "Fix login bug", Task.Priority.HIGH, 1L));
        taskQueue.offer(new Task(102L, "Update documentation", Task.Priority.LOW, 2L));
        taskQueue.offer(new Task(103L, "Resolve payment error", Task.Priority.HIGH, 3L));
        taskQueue.offer(new Task(104L, "Write unit tests", Task.Priority.MEDIUM, 4L));
        taskQueue.offer(new Task(105L, "Optimize database", Task.Priority.HIGH, 5L));
        taskQueue.offer(new Task(106L, "Update UI", Task.Priority.LOW, 6L));
        taskQueue.offer(new Task(107L, "Review pull request", Task.Priority.MEDIUM, 7L));
        taskQueue.offer(new Task(108L, "Fix API timeout", Task.Priority.HIGH, 8L));
        taskQueue.offer(new Task(109L, "Refactor service", Task.Priority.MEDIUM, 9L));
        taskQueue.offer(new Task(110L, "Update dependencies", Task.Priority.LOW, 10L));


        taskService service = new taskService();
        service.boundedCapacity(taskQueue);
        service.peekNextTask(taskQueue);
        service.addTaskAndCompare(taskQueue);
        service.removeTask(taskQueue);

    }
}