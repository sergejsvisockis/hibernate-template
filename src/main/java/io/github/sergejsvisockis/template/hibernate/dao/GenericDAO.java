package io.github.sergejsvisockis.template.hibernate.dao;

import java.util.List;

public interface GenericDAO<E, T> {
    List<E> findAll();

    E findById(T id);

    E save(E entity);

    E update(E customer);
}
