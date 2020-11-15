package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class dbActions extends commonOps {
    @Step("get Credentials from DB")
    public static List <String> getCredentials (String query)
    {

        List <String> credentials = new ArrayList<String>();
        try {
            rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));


        }
        catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return credentials;
    }
}
