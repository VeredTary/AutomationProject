package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;

public class DBActions extends CommonOps
{
    @Step("Get Data from DB")
    public static void GetData(String Query)
    {
        try
        {
            rs = stmt.executeQuery(Query);
            rs.next();
            System.out.println("The Name is: " + rs.getString(1));
            System.out.println("The LastName is: " + rs.getString(2));
        }
        catch (Exception e)
        {
            System.out.println("Error in Printing Data from DB, See Details: " + e);
        }

    }
}
