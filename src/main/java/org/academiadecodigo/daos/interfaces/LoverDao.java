package org.academiadecodigo.daos.interfaces;


import org.academiadecodigo.persistence.model.Lover;

public interface LoverDao extends CRUDdao<Lover> {

    Lover findById(Integer id);

}
