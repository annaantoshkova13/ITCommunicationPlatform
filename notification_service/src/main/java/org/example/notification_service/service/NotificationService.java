package org.example.notification_service.service;

import org.example.notification_service.dto.UserDto;

public interface NotificationService {

    void send(UserDto user, String message);

    UserDto.PreferredContact getPreferredContact();
}