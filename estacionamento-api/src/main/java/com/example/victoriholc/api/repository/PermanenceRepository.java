package com.example.victoriholc.api.repository;

import com.example.victoriholc.api.model.Permanence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermanenceRepository extends JpaRepository<Permanence, String> {
}