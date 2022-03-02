package com.hotels17.serviciohoteles.servicio;

import com.hotels17.serviciohoteles.dao.HabitacionDAO;
import com.hotels17.serviciohoteles.dao.HotelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private HotelDAO hotelDAO;

    @Autowired
    private HabitacionDAO habitacionDAO;
}
