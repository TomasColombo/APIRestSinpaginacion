package com.JApiRestIntro.JApiRestIntro.Servicios;

import com.JApiRestIntro.JApiRestIntro.Entidades.Autor;
import com.JApiRestIntro.JApiRestIntro.Repositorios.AutorRepository;
import com.JApiRestIntro.JApiRestIntro.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository ;

    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }

}