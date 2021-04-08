package org.academiadecodigo.services;

import org.academiadecodigo.persistence.Couple;

public interface LoginService {

    boolean checkCredentials(String coupleName, String password);

    boolean register(Couple couple);
}
