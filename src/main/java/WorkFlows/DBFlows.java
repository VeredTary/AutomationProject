package WorkFlows;

import Extensions.DBActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class DBFlows extends CommonOps
{
    @Step("Get Name and LastName from Employees DB")
    public static void DBinfo()
    {
        DBActions.GetData("SELECT name, lastname FROM Employees WHERE id=1");
    }
}
