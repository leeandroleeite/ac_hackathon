package org.academiadecodigo.daos;

import org.academiadecodigo.daos.interfaces.LoverDao;
import org.academiadecodigo.fake.Lover;
import org.springframework.stereotype.Repository;

@Repository
public class LoverDaoImpl extends GenericDao<Lover> implements LoverDao {

    public LoverDaoImpl(Class<Lover> modelType) {
        super(modelType);
    }
}
