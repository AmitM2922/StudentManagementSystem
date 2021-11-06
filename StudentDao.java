// jdbc code is written here
package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao
{
    public static boolean Add_student(student st)
    {
        boolean f=false;
        // jdbc code for add student
        try {
            Connection con=cp.CreateC();
            String q="insert into data(ID,Name,Contact) values(?,?,?)";

            // prepared statement
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,st.getId());
            pstmt.setString(2,st.getName());
            pstmt.setString(3,st.getContact());
            pstmt.executeUpdate();
            f=true;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    public static boolean delete_student(String id)
    {
        boolean f=false;
        try
        {
            Connection con=cp.CreateC();
            String q="delete from data where ID=?";
            PreparedStatement pstmt= con.prepareStatement(q);
            pstmt.setString(1,id);
            pstmt.executeUpdate();
            f=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
    public static void display_student()
    {
        try {
            Connection con=cp.CreateC();
            String q="select * from data";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);
            while (set.next())
            {
                String id=set.getString(1);
                String name=set.getString(2);
                String contact=set.getString(3);
                System.out.println("ID : "+id);
                System.out.println("NAME : "+name);
                System.out.println("CONTACT : "+contact);
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}