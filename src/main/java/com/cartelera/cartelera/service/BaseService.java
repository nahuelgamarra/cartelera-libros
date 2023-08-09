package com.cartelera.cartelera.service;

import com.cartelera.cartelera.model.User;

import java.util.List;

public interface BaseService <E> {
  public List<E> findAll() throws Exception;
  public E  findByID(Long id)throws Exception;
  public E save(E user)throws Exception;
  public E update(Long id, E entity) throws Exception;
  public boolean delete(Long id) throws Exception;


}
