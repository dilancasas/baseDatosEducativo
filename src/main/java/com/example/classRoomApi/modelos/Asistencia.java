package com.example.classRoomApi.modelos;

import com.example.classRoomApi.ayudas.Estado;

import java.time.LocalDate;

public class Asistencia {
    private Integer idAsistencia;
    private Estado estado;
    private LocalDate fecha;

    public Asistencia() {
    }

    public Asistencia(Integer idAsistencia, Estado estado, LocalDate fecha) {
        this.idAsistencia = idAsistencia;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Integer getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(Integer idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
