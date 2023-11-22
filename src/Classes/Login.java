package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login 
{
    public String authenticateUser(String email, String password) 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("C:\\APU\\Year 2\\SEMESTER 1\\Assignments\\Object Oriented Development with Java\\University Food Ordering System\\Users.txt"));
            String Email = null;
            String Password = null;
            String role = null;
            String line;
            
            while ((line = br.readLine()) != null)
            {
                if (line.startsWith("Email:")) 
                {
                    Email = line.substring(6).trim();
                } 
                else if (line.startsWith("Password:")) 
                {
                    Password = line.substring(9).trim();
                } 
                else if (line.startsWith("Role:")) 
                {
                    role = line.substring(5).trim();
                }

                if (Email != null && Password != null && role != null) 
                {
                    if (email.equals(Email) && password.equals(Password)) 
                    {
                        br.close();
                         return role;
                    } 
                    Email = null;
                    Password = null;
                    role = null;
                }
            }
            br.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return "Invalid email and password"; 
    }
}
