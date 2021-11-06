package student;
public class student
{
    private String id;
    private String Name;
    private String contact;

    public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
        return id;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setContact(String contact)
    {
        this.contact=contact;
    }
    public String getContact()
    {
        return contact;
    }

    public student(String id,String Name,String contact)
    {
        this.id=id;
        this.Name=Name;
        this.contact=contact;
    }

}