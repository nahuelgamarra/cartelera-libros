package com.cartelera.cartelera.service;

import com.cartelera.cartelera.model.Author;
import com.cartelera.cartelera.model.User;
import com.cartelera.cartelera.repositories.BaseRepository;
import com.cartelera.cartelera.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp extends BaseServiceImpl<User, Long> implements UserService {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(BaseRepository<User, Long> baseRepository) {
        super(baseRepository);
    }


}
