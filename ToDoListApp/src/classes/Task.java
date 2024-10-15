package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task {
    private static int idCounter = 1;
    private int id;
    private String description;
    private String deadline;
    private boolean isCompleted;
    private String priority;
    
    public Task(String description, String deadline, String priority) {
        this.id = idCounter++;
        this.description = description;
        this.deadline = deadline;
        this.isCompleted = false;
        this.priority = priority;
    }
    
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public String getDeadline() {
        return deadline;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
<<<<<<< HEAD
    //Updated method to include logging
=======
    
    public String getPriority() {
    	return priority;
    }
    
>>>>>>> b4142642c1f49450c647f18b2b4569b66b91a748
    public void markAsCompleted() {
        this.isCompleted = true;
        System.out.println("Task ID " + id + " marked as completed."); //Log completion
    }
    @Override
    public String toString() {
        return "Task ID: " + id +
               ", Description: " + description +
               ", Deadline: " + deadline +
               ", Completed: " + (isCompleted ? "Yes" : "No");
    }
}