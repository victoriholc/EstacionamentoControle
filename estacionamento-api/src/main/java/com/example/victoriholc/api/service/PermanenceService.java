package com.example.victoriholc.api.service;

import com.example.victoriholc.api.model.Permanence;
import com.example.victoriholc.api.repository.PermanenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PermanenceService {
    private final PermanenceRepository permanenceRepository;

    public List<Permanence> findAll() {
        return permanenceRepository.findAll();
    }

    public Permanence findById(String id) {
        return permanenceRepository.findById(id).orElse(null);
    }

    public Permanence save(Permanence permanence) {
        return permanenceRepository.save(permanence);
    }

    public Permanence update(String id, Permanence permanence) {
        Permanence permanenceToUpdate = permanenceRepository.findById(id).orElse(null);

        if (permanenceToUpdate != null) {
            permanenceToUpdate.setEntryTime(permanence.getEntryTime());
            permanenceToUpdate.setExitTime(permanence.getExitTime());
            permanenceToUpdate.setTotalValue(permanence.getTotalValue());
            permanenceToUpdate.setCar(permanence.getCar());
            permanenceToUpdate.setParkingSpot(permanence.getParkingSpot());

            return permanenceRepository.save(permanenceToUpdate);
        }

        return null;
    }

    public void delete(String id) {
        permanenceRepository.deleteById(id);
    }

    public Permanence performExit(String id) {
        Permanence permanence = permanenceRepository.findById(id).orElse(null);

        if (permanence != null && permanence.getExitTime() == null) {
			permanence.setExitTime(LocalDate.now());

            Double totalValue = calculateTotalValue(permanence.getEntryTime(), permanence.getExitTime());
            permanence.setTotalValue(totalValue);

            return permanenceRepository.save(permanence);
        }

        return null;
    }

    private Double calculateTotalValue(LocalDate entryTime, LocalDate exitTime) {
        long diff = exitTime.getLong(ChronoField.EPOCH_DAY) - entryTime.getLong(ChronoField.EPOCH_DAY);
        long diffHours = diff / (60 * 60 * 1000);

        return diffHours * 5.0;
    }
}
