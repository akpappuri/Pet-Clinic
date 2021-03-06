package com.spark.sfgpetclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findByID(ID id);
    T save(Long id, T object);

    void delete(T object);
    void deleteById(ID id);
}
