package com.hotels17.serviciohoteles.dao;

import com.hotels17.serviciohoteles.modelo.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionDAO extends JpaRepository<Habitacion, Integer> {
}
