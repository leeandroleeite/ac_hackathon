package org.academiadecodigo.controllers;

import org.academiadecodigo.LoginForm;
import org.academiadecodigo.persistence.model.Couple;
import org.academiadecodigo.services.CoupleService;
import org.academiadecodigo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private LoginService loginService;
    private CoupleService coupleService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Autowired
    public void setCoupleService(CoupleService coupleService) {
        this.coupleService = coupleService;
    }

    @RequestMapping(method = RequestMethod.GET, path={"/{coupleName}"})
    public ResponseEntity<Couple> getCouple(@PathVariable String coupleName) {

        Couple couple = coupleService.getCouple(coupleName);
        if(couple == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(couple, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path={"/login"})
    public ResponseEntity<Couple> login(@RequestBody LoginForm loginForm) {

        if(!loginService.checkCredentials(loginForm.getUsername(), loginForm.getPassword())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Couple couple = coupleService.getCouple(loginForm.getUsername());

        return new ResponseEntity<>(couple, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/register"})
    public ResponseEntity<Couple> register(@RequestBody Couple couple) {
        if(!loginService.register(couple)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Couple>(couple, HttpStatus.OK);
    }
}
