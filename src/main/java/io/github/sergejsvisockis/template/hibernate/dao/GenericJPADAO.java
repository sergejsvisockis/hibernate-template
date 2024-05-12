package io.github.sergejsvisockis.template.hibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
@SuppressWarnings("unchecked")
public abstract class GenericJPADAO<T, ID extends Serializable> implements GenericDAO<T, ID> {

    private final Class<T> persistenceClass;
    private final EntityManager entityManager;

    public Class<T> getPersistenceClass() {
        return persistenceClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected GenericJPADAO(Class<T> persistenceClass) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("template-persistence");
        this.entityManager = emf.createEntityManager();
        this.persistenceClass = persistenceClass;
    }

    @Override
    public List<T> findAll() {
        return getEntityManager().createQuery("select x from " + getPersistenceClass().getSimpleName() + " x").getResultList();
    }

    @Override
    public T findById(ID id) {
        return getEntityManager().find(getPersistenceClass(), id);
    }

    @Override
    public T save(T entity) {
        getEntityManager().persist(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        return getEntityManager().merge(entity);
    }
}
