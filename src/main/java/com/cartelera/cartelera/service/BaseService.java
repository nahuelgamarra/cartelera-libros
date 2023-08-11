package com.cartelera.cartelera.service;

import com.cartelera.cartelera.model.BaseEntity;
import com.cartelera.cartelera.model.User;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntity, ID extends Serializable> {
  public List<E> findAll() throws Exception;
  public E  findByID(ID id)throws Exception;
  public E save(E user)throws Exception;
  public E update(ID id, E entity) throws Exception;
  public boolean delete(ID id) throws Exception;


}
