package br.com.lsilva.javacloud.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {

    T save(T entity);

    List<T> findAll();

    Boolean delete(Integer id);

    T update(Integer id, T entity);

    Optional<T> findById(Integer id);
}