package org.academiadecodigo.daos;


import org.academiadecodigo.daos.interfaces.CoupleDao;
import org.academiadecodigo.persistence.Couple;
import org.springframework.stereotype.Repository;

@Repository
public class CoupleDaoImpl extends GenericDao<Couple> implements CoupleDao {

    public CoupleDaoImpl(Class<Couple> modelType) {
        super(modelType);
    }

    @Override
    public Couple findByUsername(String coupleName) {
        return em.find(modelType, coupleName);
    }
}
