package org.academiadecodigo.daos.interfaces;

import org.academiadecodigo.persistence.model.AbstractModel;

import java.util.List;

public interface CRUDdao<T extends AbstractModel> {

    /**
     * Gets a list of the model type
     *
     * @return the model list
     */
    List<T> findAll();


    /**
     * Saves or updates the model
     *
     * @param modelObject the model to be saved or updated
     * @return the saved or updated model
     */
    T saveOrUpdate(T modelObject);

    /**
     * Deletes the model
     *
     * @param id the id of the model to be deleted
     */
    void delete(Integer id);
}
