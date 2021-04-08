package org.academiadecodigo.persistence.daos.interfaces;

import org.academiadecodigo.persistence.model.Couple;

import java.util.List;

public interface CoupleDao<T> {

    Couple findByUsername(String coupleName);

    List<T> findAll();

    T saveOrUpdate(T modelObject);

    void delete(String coupleName);
}
