package com.hotels17.serviciohoteles.modelo;

import javax.persistence.*;

@Entity
@Table(name = "Habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_hotel")
    private Integer idHotel;

    @Column(name = "precio_persona")
    private Double precioPersona;

    private Integer planta;

    @Column(name = "numero_habitacion")
    private Integer numeroHabitacion;
}
