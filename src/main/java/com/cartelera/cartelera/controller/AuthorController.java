package com.cartelera.cartelera.controller;

import com.cartelera.cartelera.model.Author;
import com.cartelera.cartelera.service.AuthorServiceImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "author")
public class AuthorController extends BaseControllerImpl<Author, AuthorServiceImp> {
}
