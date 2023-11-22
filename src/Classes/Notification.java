
package Classes;

import java.io.*;
import java.util.*;


public class Notification 
{
    private String name;
    private String message;
    
    public Notification(String name, String message)
    {
        this.name = name;
        this.message = message;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }


    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message) 
    {
        this.message = message;
    }
    
    public List<String> getusersname()
    {
        List<String> usersname = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/Notification.txt")))
        {
            String line;
            
            while((line = br.readLine()) != null)
            {
                if(line.trim().isEmpty())
                {
                    continue;
                }
                String[] keyValue = line.split(":");
                
                if(keyValue.length >= 2)
                {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    
                    if(key.equals("name"))
                    {
                        usersname.add(value);
                    }
                }
                
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return usersname;
    }
    
    
    
}
