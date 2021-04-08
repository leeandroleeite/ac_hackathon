package org.academiadecodigo.daos;

import org.academiadecodigo.fake.Couple;

public interface CoupleDao extends CRUDdao<Couple> {

    Couple findByUsername(String coupleName);
}
