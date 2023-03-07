package org.example.SeminarOOP2.hw.NbOOP.repository;

import org.example.SeminarOOP2.hw.NbOOP.domain.Laptop;

import java.util.Set;

/**
 * Интерфейс LaptopRepository обеспечивает доступ к Базе данных со стороны сервисов
 */
public interface LaptopRepository {
    int count();

    Laptop save(Laptop laptop);

    Set<Laptop> getAllLaptop();

}
