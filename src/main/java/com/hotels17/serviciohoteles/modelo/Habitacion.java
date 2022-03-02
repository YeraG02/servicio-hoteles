package com.hotels17.serviciohoteles.modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @Column(name = "id_hotel")
    private Integer idHotel;

    @Column(name = "precio_persona")
    private Double precioPersona;

    private Integer planta;

    @Column(name = "numero_habitacion")
    private Integer numeroHabitacion;

    private String foto;

    private Boolean fumador;

    public Habitacion() {
    }

    public Habitacion(Integer id, String nombre, Integer idHotel, Double precioPersona, Integer planta, Integer numeroHabitacion, String foto, Boolean fumador) {
        this.id = id;
        this.nombre = nombre;
        this.idHotel = idHotel;
        this.precioPersona = precioPersona;
        this.planta = planta;
        this.numeroHabitacion = numeroHabitacion;
        this.foto = foto;
        this.fumador = fumador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(Integer idHotel) {
        this.idHotel = idHotel;
    }

    public Double getPrecioPersona() {
        return precioPersona;
    }

    public void setPrecioPersona(Double precioPersona) {
        this.precioPersona = precioPersona;
    }

    public Integer getPlanta() {
        return planta;
    }

    public void setPlanta(Integer planta) {
        this.planta = planta;
    }

    public Integer getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(Integer numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getFumador() {
        return fumador;
    }

    public void setFumador(Boolean fumador) {
        this.fumador = fumador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idHotel=" + idHotel +
                ", precioPersona=" + precioPersona +
                ", planta=" + planta +
                ", numeroHabitacion=" + numeroHabitacion +
                ", foto='" + foto + '\'' +
                ", fumador=" + fumador +
                '}';
    }
}
