package com.example.classRoomApi.modelos;

import java.time.LocalDate;

public class Estudiante {

    private Integer idEstudiante;
    private String grado;
    private String direccion;
    private LocalDate fechaNacimiento;

    public Estudiante() {
    }

    public Estudiante(Integer idEstudiante, String grado, String direccion, LocalDate fechaNacimiento) {
        this.idEstudiante = idEstudiante;
        this.grado = grado;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
