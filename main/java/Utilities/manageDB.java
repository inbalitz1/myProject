package Utilities;

import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class manageDB extends commonOps
{
    public static void initConnection(String dbURL, String user, String pass )
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(dbURL, user, pass);
            stmt = con.createStatement();
        }
        catch (ClassNotFoundException e)
        {e.printStackTrace();} catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void closeConnection()
    {
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
