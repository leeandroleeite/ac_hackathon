package org.academiadecodigo.services;


import org.academiadecodigo.persistence.model.Couple;

public interface CoupleService {

    Couple getCouple(String username);
}
