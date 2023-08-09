package com.cartelera.cartelera.service;

import com.cartelera.cartelera.model.User;
import com.cartelera.cartelera.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp implements BaseService <User> {


    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List findAll() throws Exception {
        try {
            List<User> users = userRepository.findAll();
            return users;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public User findByID(Long id) throws Exception {
        try {
            Optional<User> user = userRepository.findById(id);
            return user.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public User save(User user) throws Exception {
        try {
            user = userRepository.save(user);
            return user;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public User update(Long id, User entity) throws Exception {
        try {
            Optional<User> optional = userRepository.findById(id);
            User user = optional.get();
            user= userRepository.save(entity);
            return user;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean delete(Long id) throws Exception {
        try {
                if(userRepository.existsById(id)){
                    userRepository.deleteById(id);
                    return true;
                }else {
                    throw new Exception();
                }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
