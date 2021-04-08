package org.academiadecodigo.services;

import org.academiadecodigo.fake.Couple;

public interface LoginService {

    boolean checkCredentials(String coupleName, String password);

    boolean register(Couple couple);
}
