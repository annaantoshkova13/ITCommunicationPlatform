package org.example.post_service.dto.user;

public record UserDto(
        Long id,
        String username,
        String email
) {
}
