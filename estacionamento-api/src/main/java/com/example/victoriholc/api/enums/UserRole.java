package com.example.victoriholc.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRole {
    ADMIN("admin"), USER("user");

	private final String role;
}
