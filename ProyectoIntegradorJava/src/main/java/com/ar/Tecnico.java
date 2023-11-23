package com.ar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Data //Me agrega el constuctor, los get y sets, equals, hash, toString, etc. Pero decidi agregarlos igual
@Entity
@Table(name = "tecnico")
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTecnico;

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

    @OneToMany(mappedBy = "tecnico")
    private List<Incidente> incidentes;

    @ManyToMany
    @JoinTable(name = "tecnico",
            joinColumns = @JoinColumn(name = "tecnico_id"),
            inverseJoinColumns = @JoinColumn(name = "especialidad_id"))
    private List<Especialidad> especialidades;


    public Tecnico() {
    }

    public Tecnico(Integer idTecnico, String nombre, String apellido, String email, String telefono, Especialidad especialidades) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.especialidades = (List<Especialidad>) especialidades;
    }

    public Integer getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Integer idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidades() {
        return (Especialidad) especialidades;
    }

    public void setEspecialidades(Especialidad especialidades) {
        this.especialidades = (List<Especialidad>) especialidades;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "idTecnico=" + idTecnico + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", especialidades=" + especialidades + '}';
    }
  
}
