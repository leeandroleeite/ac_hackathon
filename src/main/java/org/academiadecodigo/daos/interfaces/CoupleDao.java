package org.academiadecodigo.daos.interfaces;

import org.academiadecodigo.persistence.Couple;

public interface CoupleDao extends CRUDdao<Couple> {

    Couple findByUsername(String coupleName);
}
