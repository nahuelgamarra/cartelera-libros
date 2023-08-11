package com.cartelera.cartelera.service;

import com.cartelera.cartelera.model.BaseEntity;
import com.cartelera.cartelera.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {

    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public List<E> findAll() throws Exception {
        try {
            List<E> users = baseRepository.findAll();
            return users;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public E findByID(ID id) throws Exception {
        try {
            Optional<E> user = baseRepository.findById(id);
            return user.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public E save(E user) throws Exception {
        try {
            user = baseRepository.save(user);
            return user;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> optional = baseRepository.findById(id);
            E user = optional.get();
            user = baseRepository.save(entity);
            return user;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepository.existsById(id)) {
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
