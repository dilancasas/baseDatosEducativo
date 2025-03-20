package com.example.classRoomApi.modelos;

import java.time.LocalDateTime;

public class Inscripcion {
    private Integer idInscripcion;
    private LocalDateTime fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(Integer idInscripcion, LocalDateTime fechaInscripcion) {
        this.idInscripcion = idInscripcion;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Integer getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(Integer idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public LocalDateTime getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
