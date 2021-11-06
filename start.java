package student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public  class start{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("  ***  STUDENT MANAGEMENT SYSTEM  ***  ");

        while (true)
        {
            System.out.println("Press 1 : ADD STUDENT ");
            System.out.println("Press 2 : DELETE STUDENT ");
            System.out.println("Press 3 : DISPLAY ");
            System.out.println("Press 4 : EXIT ");
            int choice= Integer.parseInt(br.readLine());
            // Add Student
            if (choice==1)
            {
                System.out.println("Enter Enrollment No : ");
                String id= br.readLine();
                System.out.println("Enter Name : ");
                String name= br.readLine();
                System.out.println("Enter Contact : ");
                String contact= br.readLine();

                //creat student object
                student st=new student(id,name,contact);
                boolean result=StudentDao.Add_student(st);
                if (result)
                    System.out.println("Student added successfully ...");
                else
                    System.out.println("Oops!!! something is wrong");

            }
            // DELETE STUDENT

            else if (choice==2)
            {
                System.out.println("Enter Enrollment No : ");
                String id_delete= br.readLine();
                boolean ans=StudentDao.delete_student(id_delete);
                if (ans)
                    System.out.println("Successfully deleted!!!");
                else
                    System.out.println("Oops!!! something is wrong");

            }
            // DISPLAY STUDENT
            else if(choice==3)
            {
                StudentDao.display_student();
            }
            // EXIT
            else if (choice==4)
            {
                break;
            }
            else
            {
                System.out.println("INVALID INPUT !!!");

            }


        }
    }
}