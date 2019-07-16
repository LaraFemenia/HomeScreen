package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheccid
 */
public class DataBaseConection {

    final String DataBaseDirection = "jdbc:mysql://127.0.0.1/HomeScreen";
    final String DataBaseUser = "root";
    final String DataBasePassword = "";
    Connection connection;

    public DataBaseConection() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DataBaseDirection, DataBaseUser, DataBasePassword);
            System.out.println("Successful connection");
        } catch (ClassNotFoundException ex) {

            System.out.println("Connection failed");
            Logger.getLogger(DataBaseConection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

    }

    public void Insert(String Consult) throws SQLException {

        Statement statement = this.connection.createStatement();
        statement.executeUpdate(Consult);
    }

}
