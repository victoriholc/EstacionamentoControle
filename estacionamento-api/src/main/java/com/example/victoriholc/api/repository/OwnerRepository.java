package com.example.victoriholc.api.repository;

import com.example.victoriholc.api.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, String> {
}