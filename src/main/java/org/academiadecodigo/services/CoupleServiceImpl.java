package org.academiadecodigo.services;


import org.academiadecodigo.persistence.daos.interfaces.CoupleDao;
import org.academiadecodigo.persistence.model.Couple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoupleServiceImpl implements CoupleService{

    private CoupleDao coupleDao;

    @Autowired
    public void setCoupleDao(CoupleDao coupleDao) {
        this.coupleDao = coupleDao;
    }

    @Override
    public Couple getCouple(String username) {
        return coupleDao.findByUsername(username);
    }

    @Override
    public void removeCouple(String coupleName) {
        coupleDao.delete(coupleName);

    }
}
