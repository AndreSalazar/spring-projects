package com.secondExercise;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
}
