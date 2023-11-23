package com.ar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;

@Data //Me agrega el constuctor, los get y sets, equals, hash, toString, etc. Pero decidi agregarlos igual
@Entity
@Table(name = "notificacionincidente")
public class NotificacionIncidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int idNotificacionIncidente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    private java.sql.Date fechaNotificacion;

    private java.sql.Timestamp tiempoEstimado;

    public NotificacionIncidente() {
    }

    public NotificacionIncidente(Tecnico tecnico, Date fechaNotificacion) {
        this.tecnico = tecnico;
        this.fechaNotificacion = (java.sql.Date) fechaNotificacion;
    }

    public Integer getIdNotificacionIncidente() {
        return idNotificacionIncidente;
    }

    public void setIdNotificacionIncidente(Integer idNotificacionIncidente) {
        this.idNotificacionIncidente = idNotificacionIncidente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = (java.sql.Date) fechaNotificacion;
    }

    @Override
    public String toString() {
        return "NotificacionIncidente{" + "idNotificacionIncidente=" + idNotificacionIncidente + ", tecnico=" + tecnico + ", fechaNotificacion=" + fechaNotificacion + '}';
    }

}
