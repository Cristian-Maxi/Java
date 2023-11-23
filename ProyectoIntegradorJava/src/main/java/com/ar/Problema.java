package com.ar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //Me agrega el constuctor, los get y sets, equals, hash, toString, etc. Pero decidi agregarlos igual
@Entity
@Table(name = "problema")
public class Problema {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProblema;

    private String tipo;

    private String descripcion;

    public Problema() {
    }

    public Problema(Integer idProblme, String tipo, String descripcion) {
        this.idProblema = idProblme;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public Integer getIdProblma() {
        return idProblema;
    }

    public void setIdProblma(Integer idProblma) {
        this.idProblema = idProblma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Problema{" + "idProblma=" + idProblema + ", tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }

}
