package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class UpdateProfile
{
    private String loggedInEmail;
    private String loggedInPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtPassword;

    
    private Map<String, String> userInfo = new HashMap<>();
    
    public UpdateProfile(String email, String password, javax.swing.JTextField txtEmail, javax.swing.JTextField txtName, javax.swing.JTextField txtContact, javax.swing.JTextField txtPassword)
    {
        this.loggedInEmail = email;
        this.loggedInPassword = password;
        this.txtEmail = txtEmail;
        this.txtName = txtName;
        this.txtContact = txtContact;
        this.txtPassword = txtPassword;
        
        readUserInfoFromFile();
    }
    
    private void readUserInfoFromFile()
    {
        boolean foundUser = false;
        try(BufferedReader re = new BufferedReader(new FileReader("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/Users.txt")))
        {
            String line;
            while((line = re.readLine()) != null)
            {
                String[] parts = line.split(":");
                if(parts.length == 2)
                {
                    userInfo.put(parts[0], parts[1]);
                }
                
                if(userInfo.containsKey("Email") && userInfo.containsKey("Password") && userInfo.get("Email").equals(loggedInEmail) && userInfo.get("Password").equals(loggedInPassword))
                {
                    foundUser = true;
                    break;
                }
            }
            
            if(foundUser)
            {
                String name = userInfo.get("Name");
                String contact = userInfo.get("Contact");
                String password = userInfo.get("Password");
                
                txtName.setText(name);
                txtEmail.setText(loggedInEmail);
                txtContact.setText(contact);
                txtPassword.setText(password);


            }
            else
            {
                userInfo.clear();
            }
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public String getName()
    {
        return userInfo.get("Name");
    }
    
    public String getEmail()
    {
       return userInfo.get("Email");
    }
    
    public String getContact()
    {
       return userInfo.get("Contact");
    }
    
    public String getPassword()
    {
       return userInfo.get("Password");
    }
    
    
    public void updateProfile(String name, String email, String contact, String password)
    {
        List<String> updatedUserLines = new ArrayList<>();
        boolean isCurrentUser = false;
        
        try(BufferedReader re = new BufferedReader(new FileReader("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/Users.txt")))
        {
            String line;
            boolean updated = false;
            
            while ((line = re.readLine()) != null)
            {
                String[] parts = line.split(":");
                
                if(parts.length == 2)
                {
                    String key = parts[0].trim();
                    String value = parts[1].trim();
                    
                    if (key.equals("Email") && value.equals(loggedInEmail))
                    {
                        isCurrentUser = true;
                                            
                        updatedUserLines.add("Name:" + name);
                        updatedUserLines.add("Email:" + email);
                        updatedUserLines.add("Contact:" + contact);
                        updatedUserLines.add("Password:" + password);
                        
                        updated = true;
                    } 
                    else
                    {
                        updatedUserLines.add(line);
                    }
                }
                else
                {
                    updatedUserLines.add(line);
                }
            }
            
            if(!updated)
            {
                updatedUserLines.add("Name:" + name);
                updatedUserLines.add("Email:" + email);
                updatedUserLines.add("Contact:" + contact);
                updatedUserLines.add("Password:" + password);
            }
        }
        catch(IOException e)
        {
           e.printStackTrace();
        }
            
       try(FileWriter wr = new FileWriter("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/Users.txt"))
        {        
            for(String updatedLine : updatedUserLines)
            {
               wr.write(updatedLine + "\n");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
