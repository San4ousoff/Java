package org.example.diplomademo.repositories;

import org.example.diplomademo.entities.SalePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalePointRepository extends JpaRepository<SalePoint, Long> {
    List<SalePoint> getIdByName(String name);
}
