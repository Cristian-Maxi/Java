package com.ar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Data //Aqui dejamos que Lombock se encargue de los getters and setters
@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;

    private String nombre;

    @ManyToMany(mappedBy = "especialidades")
    private List<Tecnico> tecnicos;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String nombre, List<Tecnico> tecnicos) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.tecnicos = tecnicos;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + ", nombres=" + nombre + '}';
    }
    
}
