package org.example;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<String> notifications;

    public NotificationService() {
        notifications = new ArrayList<>();
    }

    public void notify(User user, String message) {
        notifications.add("Notification for " + user.username + ": " + message);
    }
}