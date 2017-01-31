package controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pojo.Usuari;

import java.util.ArrayList;

/**
 * Created by jgarcias on 31/01/17.
 */
@RestController
public class ControllerUsuari {
    public ArrayList<Usuari> usuariList = new ArrayList<Usuari>;

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public Usuari hello() {
        return new Usuari("hola","Hipopotamito","Diosito");
    }

    @RequestMapping(value = "/echo", method = RequestMethod.POST)
    public Usuari user(@RequestBody Usuari request) {
        return request;
    }

}



