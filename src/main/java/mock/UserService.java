package mock;

import model.Usuari;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by jgarcias on 31/01/17.
 */
public interface UserService {
    List<Usuari> findAllUsers();
    List<Usuari> findAllUsers(String name, boolean fillRoll) throws SQLException;


}
