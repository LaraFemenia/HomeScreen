package Controller;

import Model.RegisterModel;
import java.sql.SQLException;

/**
 *
 * @author Sheccid
 */
public class RegisterController {

    RegisterModel SendToModel;

    public void Insert(String Username, String Email, String Password) throws SQLException {

        SendToModel = new RegisterModel();
        SendToModel.setUsername(Username);
        SendToModel.setPassword(Password);
        SendToModel.setEmail(Email);

        SendToModel.Insert();
    }

}
