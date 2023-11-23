package com.ar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //Me agregar el constuctor, los get y sets, equals, hash, toString, etc.
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    private String razonSocial;

    private String cuit;

    public Cliente() {
    }

    public Cliente(Integer id, String razonSocial, String cuit) {
        this.idCliente = id;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", razonSocial=" + razonSocial + ", cuit=" + cuit + '}';
    }

}
