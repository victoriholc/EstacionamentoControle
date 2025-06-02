package com.example.victoriholc.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "permanences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Permanence {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private LocalDate entryTime;

    private LocalDate exitTime;

    private Double totalValue;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    @NotNull(message = "Car is mandatory")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "parking_spot_id", nullable = false)
    @NotNull(message = "Parking spot is mandatory")
    private ParkingSpot parkingSpot;
}
