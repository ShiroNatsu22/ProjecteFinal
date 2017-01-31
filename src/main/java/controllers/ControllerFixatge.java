package controllers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pojo.Fixatge;
import java.util.Date;

/**
 * Created by jgarcias on 31/01/17.
 */
@RestController
public class ControllerFixatge {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Fixatge hello() {
        return new Fixatge("Diosito",new Date());
    }

    @RequestMapping(value = "/echo", method = RequestMethod.POST)
    public Fixatge fich(@RequestBody Fixatge request) {
        return request;
    }

}