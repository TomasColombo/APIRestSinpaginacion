package com.JApiRestIntro.JApiRestIntro.Servicios;

import com.JApiRestIntro.JApiRestIntro.Entidades.Persona;
import com.JApiRestIntro.JApiRestIntro.Repositorios.BaseRepository;
import com.JApiRestIntro.JApiRestIntro.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }


    @Override
    public List<Persona> search(String filtro) throws Exception {
        return null;
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        return null;
    }
}
