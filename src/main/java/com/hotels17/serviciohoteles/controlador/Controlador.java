package com.hotels17.serviciohoteles.controlador;

import com.hotels17.serviciohoteles.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
    @Autowired
    private Servicio servicio;
}
