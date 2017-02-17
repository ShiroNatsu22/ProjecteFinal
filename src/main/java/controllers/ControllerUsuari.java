package controllers;
import mock.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import model.Usuari;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jgarcias on 31/01/17.
 */


@RestController
public class ControllerUsuari {
    //We only use Qualifier when there is a
    //conflict between two beans for the UserService
    @Inject
    @Qualifier("userMock")//Hay que poner el nombre de la id del bean para que coja esa o bien usando @Qualifier(nombre_id)(tiene que ir siempre acompañadp de @Injector
    private UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Usuari> findAllUsers() {

        return service.findAllUsers();
    }
}

