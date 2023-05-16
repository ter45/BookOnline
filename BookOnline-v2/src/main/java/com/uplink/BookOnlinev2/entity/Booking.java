
package com.uplink.BookOnlinev2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    //Creando variables de la entidad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false, length = 60)
    private String mail;

    private String origen;
    private String destino;
    private Date fecha;
    private String horaSalida;
    private String duración;

    //Costructor vacio
    public Booking() {
    }

    public Booking(Integer id, String nombre, String mail, String origen, String destino, Date fecha, String horaSalida, String duración) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.horaSalida = horaSalida;
        this.duración = duración;
    }
  //Creando los GET AN SET

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }
    
}
