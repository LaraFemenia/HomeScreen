package Model;

import Util.DataBaseConection;
import java.sql.SQLException;

/**
 *
 * @author Sheccid
 */
public class RegisterModel {

    //Global attributes
    private String Username;
    private String Password;
    private String Email;
    DataBaseConection SendToDataBase;

    //Constructor
    public RegisterModel() {
    }

    //Setters and Getters methods
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    public void Insert () throws SQLException{
    
        SendToDataBase = new DataBaseConection ();
        
    }
}
