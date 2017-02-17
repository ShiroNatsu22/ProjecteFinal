package mock;

import model.Fixatge;
import model.Usuari;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jgarcias on 01/02/17.
 */
public class UserMock implements UserService{
    private ArrayList<Usuari> userList = new ArrayList<Usuari>();
    private List<Fixatge> fixatgeList = new ArrayList<Fixatge>();

    @Override
    public List<Usuari> findAllUsers() {



        Usuari user = new Usuari();

        user.setNom("Hipito");
        userList.add(user);

        user = new Usuari();
        user.setNom("Pagorn07");
        userList.add(user);


        return userList;
    }

    @Override
    public List<Usuari> findAllUsers(String name, boolean fillRoll) throws SQLException {

        Usuari user = new Usuari();

        user.setNom("Hipito");
        userList.add(user);

        Fixatge fixatge = new Fixatge();
        fixatge.setId("hipito@hipitoa");
        fixatge.setDate(new Date());

        fixatgeList.add(fixatge);

        




        return null;
    }
}
