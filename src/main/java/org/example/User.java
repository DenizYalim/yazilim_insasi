package org.example;
import java.util.ArrayList;
import java.util.List;

public class User {
    public String username;
    public String email;
    public List<Task> tasks;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public boolean hasTask(String title) {
        return tasks.stream().anyMatch(task -> task.title.equals(title));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}