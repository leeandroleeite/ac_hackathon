package org.academiadecodigo.persistence.daos;


import org.academiadecodigo.persistence.daos.interfaces.CoupleDao;
import org.academiadecodigo.persistence.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CoupleDaoImpl implements CoupleDao<Couple> {

    private ArrayList<Couple> database= new ArrayList<>();

    @Override
    public Couple findByUsername(String coupleName) {
        for (int i = 0;  i < database.size(); i++) {
            if(database.get(i).getCoupleName() == coupleName) {
                return database.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Couple> findAll() {
        return database;
    }

    @Override
    public Couple saveOrUpdate(Couple modelCouple) {

        for (int i = 0;  i < database.size(); i++) {
            if(database.get(i).getCoupleName() == modelCouple.getCoupleName()) {
                database.remove(database.get(i));
                database.add(modelCouple);
                return modelCouple;
            }
        }
        database.add(modelCouple);
        return modelCouple;
    }


    @Override
    public void delete(String coupleName) {
        for (int i = 0;  i < database.size(); i++) {
            if (database.get(i).getCoupleName() == coupleName) {
                database.remove(database.get(i));
            }
        }

    }
}
