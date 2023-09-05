package cl.awekelab.miprimerspring0057.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 35)
    private String nombreCurso;


    @ManyToMany(mappedBy = "listaCursos")
    private List<Profesor> listaprofesores;

    @JsonIgnore
    @OneToMany(mappedBy = "cursoAsignado")
    private List<Alumno> listaAlumnos;

}
