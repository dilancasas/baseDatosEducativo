package com.example.classRoomApi.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Integer idCurso;

    @Column(name = "nombre", length = 100, unique = false, nullable = false )
    private String nombre;

    //creando relaciones (muchos a 1)
    @ManyToOne
    @JoinColumn(name = "fk_docente", referencedColumnName = "idDocente")
    @JsonBackReference
    private Docente docente;



    public Curso() {
    }

    public Curso(Integer idCurso, String nombre) {
        this.idCurso = idCurso;
        this.nombre = nombre;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
