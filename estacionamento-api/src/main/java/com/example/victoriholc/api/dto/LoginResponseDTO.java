package com.example.victoriholc.api.dto;

import com.example.victoriholc.api.model.User;

public record LoginResponseDTO(String token, User user) {
}
