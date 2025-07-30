package com.example.event_management.controller;

import com.example.event_management.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class NotificationController {

        @Autowired
        private NotificationService notificationService;

        @MessageMapping("/notify")
        @SendTo("/topic/updates")
        public String sendNotification(String message) {
            return notificationService.processNotification(message);
        }
    }


