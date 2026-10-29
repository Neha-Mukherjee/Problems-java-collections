public class Task implements Comparable<Task>{
    private Long taskId;
    private String taskName;
    enum Priority { LOW, MEDIUM, HIGH }
    private Priority priority;
    private Long creationSequence;


    public Task(Long taskId, String taskName, Priority priority, Long creationSequence) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.creationSequence = creationSequence;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Priority getPriority() {
        return priority;
    }

    public Long getCreationSequence() {
        return creationSequence;
    }

    public String toString() {
        return taskId + "\t" + taskName + "\t" + priority + "\t" + creationSequence;
    }

    @Override
    public int compareTo(Task o) {return this.taskId.compareTo(o.taskId);}
}
