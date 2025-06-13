package org.example;

public class Task {
    public String title;
    public String dueDate;
    public boolean completed;

    public Task(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public boolean isOverdue(String date) {
        return !completed && dueDate.compareTo(date) < 0;
    }

    public void markCompleted() {
        this.completed = true;
    }
}
