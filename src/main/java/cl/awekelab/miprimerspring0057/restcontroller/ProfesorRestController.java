package cl.awekelab.miprimerspring0057.restcontroller;

import cl.awekelab.miprimerspring0057.entity.Profesor;
import cl.awekelab.miprimerspring0057.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorRestController {

    @Autowired
    IProfesorService objProfesorService;

    @GetMapping("/{id}")
    public Profesor listarProfesor(@PathVariable Profesor profesor){
        return objProfesorService.crearProfesor(profesor);

    }
    @GetMapping
    public List<Profesor> listarProfesor() { return objProfesorService.listarProfesor();}
}
