package com.ar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data //Me agregar el constuctor, los get y sets, equals, hash, toString, etc.
@Entity
@Table(name = "incidente")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idincidente")
    private int idIncidente;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "problema_id")
    private Problema problema;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    private int estado;

    private String consideraciones;

    public Incidente() {
    }

    public Incidente(int idIncidente, Cliente cliente, Servicio servicio, Problema problema, Tecnico tecnico, int estado, String consideraciones) {
        this.idIncidente = idIncidente;
        this.cliente = cliente;
        this.servicio = servicio;
        this.problema = problema;
        this.tecnico = tecnico;
        this.estado = estado;
        this.consideraciones = consideraciones;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getConsideraciones() {
        return consideraciones;
    }

    public void setConsideraciones(String consideraciones) {
        this.consideraciones = consideraciones;
    }

    @Override
    public String toString() {
        return "Incidente{" + "idIncidente=" + idIncidente + ", cliente=" + cliente + ", servicio=" + servicio + ", problema=" + problema + ", tecnico=" + tecnico + ", estado=" + estado + ", consideraciones=" + consideraciones + '}';
    }

}
