package org.example.carfactory.data.service;

import java.util.List;

public interface AbstractService<T> {
    void saveOrUpdate(T t);
    T findById(Long id);
    List<T> findAll();
    void remove(Long id);
}
