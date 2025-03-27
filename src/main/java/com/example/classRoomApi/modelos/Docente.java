package com.example.classRoomApi.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Docente {
    private Integer idDocente;
    private String especialidad;

    //creando relacion de (1 a muchos)
    @OneToMany(mappedBy = "docente")
    @JsonManagedReference
    private List<Curso> cursos;

    public Docente() {
    }

    public Docente(Integer idDocente, String especialidad) {
        this.idDocente = idDocente;
        this.especialidad = especialidad;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

