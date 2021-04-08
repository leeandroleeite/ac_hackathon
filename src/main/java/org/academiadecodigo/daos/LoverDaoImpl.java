package org.academiadecodigo.daos;

import org.academiadecodigo.daos.interfaces.LoverDao;
import org.academiadecodigo.persistence.model.Lover;
import org.springframework.stereotype.Repository;

@Repository
public class LoverDaoImpl extends GenericDao<Lover> implements LoverDao {

    public LoverDaoImpl(Class<Lover> modelType) {
        super(modelType);
    }

    @Override
    public Lover findById(Integer id) {
        return em.find(modelType, id);
    }
}