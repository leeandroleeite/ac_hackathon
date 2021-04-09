package org.academiadecodigo.controllers;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public String testing() {
        return "index";
    }
    @RequestMapping(method = RequestMethod.GET, path = { "/login"})
    public String login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/register"})
    public String register() {
        return "register";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/profile"})
    public String profile() {
        return "profile";
    }
}
