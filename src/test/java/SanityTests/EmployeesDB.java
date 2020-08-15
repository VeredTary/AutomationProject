package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.DBFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.SQLException;

@Listeners(Utilities.listeners.class)
public class EmployeesDB extends CommonOps
{
    @Test(description = "Getting Name and LastName from Employees DB")
    @Description("Test Description: Getting Name and LastName from Employees DB")
    public void Test01_EmployeesDB() throws SQLException
    {
            DBFlows.DBinfo();
            Verifications.StringDisplayed("vered");
        }
}
