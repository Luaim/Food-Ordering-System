package Classes;

import java.util.Date;


public class Users 
{
    private String name;
    private String email;
    private String contact;
    private String password;
    private String userType;
    
    public Users(String name, String email, String contact, String password, String userType)
    {
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.userType = userType;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getContact() 
    {
        return contact;
    }

    public String getPassword() 
    {
        return password;
    }

    public String getUserType() 
    {
        return userType;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public void setUserType(String userType) 
    {
        this.userType = userType;
    }
}
