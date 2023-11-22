package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.io.*;

public class UsersTableModel extends AbstractTableModel
{
    private String[]columnNames = {"Name", "Email", "Contact", "Password", "UserType"};
    private List<Users> users;
    
    public UsersTableModel()
    {
        this.users = new ArrayList<>();
        readFromFile();
    }
    
    public UsersTableModel(List<Users> users)
    {
        this.users = users;
    }
    
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount()
    {
        return users.size();
    }
    
    @Override
    public Class getColumnClass(int column)
    {
        return String.class;
    }
    
    @Override
    public boolean isCellEditable(int row, int column)
    {
        return false;
    }
    
    public void readFromFile()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/Users.txt"))) 
        {
            List<Users> loadedUsers = new ArrayList<>();
            String line;
            
            Users user = null;
            while ((line = br.readLine()) != null)
            {
                if (line.trim().isEmpty())
                {
                    continue;
                }
                
                String[] keyValue = line.split(":");
                if (keyValue.length >= 2)
                {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    
                    if (key.equals("Name")) 
                    {
                        user = new Users("", "", "", "", "");
                        loadedUsers.add(user);
                    }
                    
                    switch (key)
                    {
                        case "Name":
                            user.setName(value);
                            break;
                        case "Email":
                            user.setEmail(value);
                            break;
                        case "Contact":
                            user.setContact(value);
                            break;
                        case "Password":
                            user.setPassword(value);
                            break;
                        case "Role":
                            user.setUserType(value);
                            break;
                    }
                }
            }
            this.users = loadedUsers;
            fireTableDataChanged();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public Object getValueAt(int row, int column)
    {
        Users user = users.get(row);
        
        switch(column)
        {
            case 0:
                return user.getName();
            case 1:
                return user.getEmail();
            case 2:
                return user.getContact();
            case 3:
                return user.getPassword();
            case 4:
                return user.getUserType();
            default:
                return null;
        }
    }
    
    public void writeToFile()
    {
        try(BufferedWriter  wr = new BufferedWriter(new FileWriter("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/Users.txt")))
        {
            for(Users user : users)
            {
                wr.write("Name:" + user.getName());
                wr.newLine();
                wr.write("Email:" + user.getEmail());
                wr.newLine();
                wr.write("Contact:" + user.getContact());
                wr.newLine();
                wr.write("Password:" + user.getPassword());
                wr.newLine();
                wr.write("Role:" + user.getUserType());
                wr.newLine();
                wr.newLine();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void addUser(Users user)
    {
        if(users != null)
        {
            users.add( user);
            writeToFile();
            fireTableDataChanged();
            
            if("customer".equalsIgnoreCase(user.getUserType()))
            {
                writeUserBalanceToFile(user.getName(), 0.0); 
            }
        }
    }
    
    public void writeUserBalanceToFile(String userName, double balance)
    {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt", true)))
        {
           wr.write("Name: " + userName);
           wr.newLine();
           wr.write("Balance: " + balance);
           wr.newLine();
           wr.newLine();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void insertUsers(int row, Users user)
    {
        users.add(row, user);
        fireTableRowsInserted(row, row);
    }
    
    public void removePerson(int row)
    {
        Users removedUser = users.get(row);
        
        if ("customer".equalsIgnoreCase(removedUser.getUserType()))
        {
            removeCustomerBalanceEntry(removedUser.getName());
        }
        
        users.remove(row);
        writeToFile();
        fireTableRowsDeleted(row, row);
    }
    
    private void removeCustomerBalanceEntry(String userName)
    {
        List<String> newLines = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt")))
        {
            String line;
            boolean skipNextLine = false;
            
            while ((line = br.readLine()) != null) 
            {
                if (line.trim().isEmpty())
                {
                    continue;
                }
                String[] keyValue = line.split(":");
                
                if (keyValue.length >= 2)
                {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    
                    if (key.equals("Name") && value.equals(userName))
                    {
                        skipNextLine = true;
                        continue;
                    }
                    if(skipNextLine)
                    {
                        skipNextLine = false;
                        continue;
                    }
                }
                newLines.add(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt")))
        {
            for (String newLine : newLines)
            {
                wr.write(newLine);
                wr.newLine();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }   
    
    public Users getPerson(int row)
    {
        return users.get(row);
    }
    
    public void setUsers(List<Users> users)
    {
        this.users = users;
        fireTableDataChanged();
    }
    
    public List<Users> getUsers()
    {
        return users;
    }
    
    public void updateData(List<Users> newData)
    {
        this.users = newData;
        fireTableDataChanged();
    }
    
    public void updateUser(int row, Users updatedUser) 
    {
         Users originalUser = users.get(row);
         users.set(row, updatedUser);
         writeToFile();
         
         if("customer".equalsIgnoreCase(originalUser.getUserType()))
         {
             updateCustomerBalanceFile(originalUser.getName(), updatedUser.getName());
         }
         fireTableRowsUpdated(row, row);
    }
    
    private void updateCustomerBalanceFile(String oldName, String newName)
    {
         List<String> newLines = new ArrayList<>();
         
        try (BufferedReader br = new BufferedReader(new FileReader("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt")))
        {
            String line;
            
            while ((line = br.readLine()) != null) 
            {
                if (line.trim().isEmpty())
                {
                    continue;
                }
                String[] keyValue = line.split(":");
                
                if (keyValue.length >= 2)
                {
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    
                    if (key.equals("Name") && value.equals(oldName))
                    {
                        newLines.add("Name: " + newName);    
                    }
                    else if(key.equals("Balance"))
                    {
                        newLines.add(line);
                    }
                    else
                    {
                        newLines.add(line);
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt")))
        {
            for (String newLine : newLines)
            {
                wr.write(newLine);
                wr.newLine();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
