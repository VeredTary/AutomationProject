package Utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps
{
    public static void initConnection(String dbURL, String User, String Pass)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, User, Pass);
            stmt = con.createStatement();
        } catch (Exception e)
        {
            System.out.println("Connection Error, see Details: " + e);
        }
    }

    public static void CloseConnection()
    {
        try
        {
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error While closing connection, See Details: " + e);
        }

    }
}