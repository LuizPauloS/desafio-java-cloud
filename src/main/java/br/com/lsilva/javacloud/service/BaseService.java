package br.com.lsilva.javacloud.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {

    T save(T entity);

    T update(T entity);

    List<T> findAll();

    Optional<T> findById(Integer id);

    Boolean delete(Integer id);
}