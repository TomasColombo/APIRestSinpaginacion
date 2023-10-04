package com.JApiRestIntro.JApiRestIntro.Servicios;

import com.JApiRestIntro.JApiRestIntro.Entidades.Localidad;
import com.JApiRestIntro.JApiRestIntro.Repositorios.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository ) {
        super(baseRepository);
    }



}
