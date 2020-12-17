package com.codegym.exammodule4.service;

import java.util.List;

public interface IService<T> {
    T save (T model);
    List<T> getAll();
    T getOne(Long id);
    void delete(Long id);



}
