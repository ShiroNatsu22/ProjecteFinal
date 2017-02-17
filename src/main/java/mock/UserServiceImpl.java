package mock;

import model.Usuari;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jgarcias on 31/01/17.
 */
public class UserServiceImpl implements UserService{


    @Override
    public List<Usuari> findAllUsers() {
        return null;
    }

    @Override
    public List<Usuari> findAllUsers(String name, boolean fillRoll) throws SQLException {
        return null;
    }
}
