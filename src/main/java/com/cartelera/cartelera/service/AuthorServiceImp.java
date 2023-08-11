package com.cartelera.cartelera.service;


import com.cartelera.cartelera.model.Author;
import com.cartelera.cartelera.repositories.AuthorRepository;
import com.cartelera.cartelera.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public  class AuthorServiceImp extends BaseServiceImpl<Author, Long> implements AuthorService{

    private AuthorRepository authorRepository;
    @Autowired
    public AuthorServiceImp(BaseRepository<Author, Long> baseRepository) {
        super(baseRepository);
    }
}
