package org.example;

import java.util.ArrayList; 

public class Project {
    private String name;
    private ArrayList<User> users;
    private ArrayList<Task> tasks;

    public Project(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void assignTask(Task task) {
        tasks.add(task);
    }


    public Task getTaskByTitle(String title) {
        //todo
        return null;
    }
}