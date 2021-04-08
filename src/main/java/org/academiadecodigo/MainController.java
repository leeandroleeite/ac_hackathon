package org.academiadecodigo;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public String testing() {
        return "farewell";

    }
}
