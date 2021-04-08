package org.academiadecodigo.services;

import org.academiadecodigo.daos.CoupleDao;
import org.academiadecodigo.persistence.Couple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class LoginServiceImpl implements LoginService{

    private CoupleDao coupleDao;

    @Autowired
    public void setCoupleDao(CoupleDao coupleDao) {
        this.coupleDao = coupleDao;
    }

    @Override
    public boolean checkCredentials(String coupleName, String password) {

        Couple couple = coupleDao.findByUsername(coupleName);
        if(couple == null) {
            return false;
        }

        return password.hashCode() == couple.getPassword();
    }

    @Transactional
    @Override
    public boolean register(Couple couple) {
        String coupleName = couple.getCoupleName();

        if(!(coupleDao.findByUsername(coupleName) == null)) {
            return false;
        }
        coupleDao.saveOrUpdate(couple);
        return true;
    }
}
