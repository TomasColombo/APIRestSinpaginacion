package com.JApiRestIntro.JApiRestIntro.Controlador;

import com.JApiRestIntro.JApiRestIntro.Entidades.Persona;
import com.JApiRestIntro.JApiRestIntro.Servicios.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas") // a lo de adentro le llama URI, ver
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{



    @GetMapping("/search")
    public ResponseEntity<?> search (@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("\"error\":\""+ e.getMessage() + "\"}"));
        }
    };

}
