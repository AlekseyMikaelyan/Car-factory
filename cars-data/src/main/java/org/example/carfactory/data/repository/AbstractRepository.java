package org.example.carfactory.data.repository;

import java.util.List;

public interface AbstractRepository<T> {
    void save(T t);
    T findById(Long id);
    List<T> findAll();
    void update(T t);
    void remove(Long id);
}
