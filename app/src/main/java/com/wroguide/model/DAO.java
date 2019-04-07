package com.wroguide.model;

import java.util.List;
import java.util.Optional;

/**
 * Created by Piotrek on 17.03.2019.
 */
public interface DAO<T> {
    Optional<T> get(long id);
    List<T> getAll();
    void save(T t);
    void update(T t, String[] params);
    void delete(T t);
}
