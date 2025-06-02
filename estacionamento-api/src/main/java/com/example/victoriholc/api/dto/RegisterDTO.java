package com.example.victoriholc.api.dto;

import com.example.victoriholc.api.enums.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
}
