package com.JApiRestIntro.JApiRestIntro.Controlador;

import com.JApiRestIntro.JApiRestIntro.Entidades.Autor;
import com.JApiRestIntro.JApiRestIntro.Servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autor") //
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
