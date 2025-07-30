package com.example.event_management.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationService {
    private final Map<String, String> notifications = new HashMap<>();

    public void sendNotification(String user, String message) {
        notifications.put(user, message);
    }

    public String getNotification(String user) {
        return notifications.getOrDefault(user, "No new notifications");
    }

    public String processNotification(String message) {
        String processed = "Notification: " + message;
        System.out.println("Processed Notification: " + processed);
        return processed;
    }
}