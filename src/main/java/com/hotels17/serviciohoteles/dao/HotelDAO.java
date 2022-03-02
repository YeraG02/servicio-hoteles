package com.hotels17.serviciohoteles.dao;

import com.hotels17.serviciohoteles.modelo.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelDAO extends JpaRepository<Hotel, Integer> {
}
