package student;
import java.sql.Connection;
import java.sql.DriverManager;

public class cp{
    static Connection con;
    public static Connection CreateC()
    {

        try
        {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root"," ");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
