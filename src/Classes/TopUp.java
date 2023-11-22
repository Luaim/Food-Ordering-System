
package Classes;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class TopUp 
{
   private final String customerBalanceFilePath; 
   
   public TopUp(String customerBalanceFilePath)
   {
       this.customerBalanceFilePath = customerBalanceFilePath;
   }
   
   public List<String> getUserNames() 
   {
       List<String> userNames = new ArrayList<>();
       
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
                   
                   if (key.equals("Name")) 
                   {
                       userNames.add(value);
                   }
               }
           }
       } 
       catch (IOException e) 
       {
           e.printStackTrace();
       }
       return userNames;
   }
   
   public void topUpBalance(String userName, double topUpAmount)
   {
       double currentBalance = getCurrentBalance(userName);
       
       if(currentBalance != -1)
       {
           double newBalance = currentBalance + topUpAmount;
           updateBalanceInFile(userName, newBalance);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "User not found. New Balance: ", "Error", JOptionPane.ERROR_MESSAGE);
       }
   }
   
   private double getCurrentBalance(String userName)
   {
       try (BufferedReader br = new BufferedReader(new FileReader(customerBalanceFilePath)))
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
                
                if (key.equals("Name") && value.equals(userName))
                {
                    line = br.readLine();
                    return Double.parseDouble(line.split(":")[1].trim());
                }
             } 
          }
       }
       catch (IOException e)
       {
            e.printStackTrace();  
       }
       return -1;
   }
   
   private void updateBalanceInFile(String userName, double newBalance) 
   {
       List<String> newLines = new ArrayList<>();
       
       try (BufferedReader br = new BufferedReader(new FileReader(customerBalanceFilePath))) 
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
                   
                   if (key.equals("Name") && value.equals(userName))
                   {
                       br.readLine();   
                       newLines.add("Name: " + userName);
                       newLines.add("Balance: " + newBalance);
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
       
       try (BufferedWriter wr = new BufferedWriter(new FileWriter(customerBalanceFilePath))) 
       {
            for (String newLine : newLines)
            {
                wr.write(newLine);
                wr.newLine();
            } 
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }
   
   public void updateUIForSelectedUser(String selectedUser, JTextField txtName2, JTextField txtBalance) 
   {
       double balance = getCurrentBalance(selectedUser);
       
       txtName2.setText(selectedUser);
       txtBalance.setText(String.valueOf(balance));
   }
   
   public String generateReceipt(String userName, double topUpAmount)
   {
       double currentBalance = getCurrentBalance(userName);
       
       if(currentBalance != -1)
       {
           
           StringBuilder r = new StringBuilder();
           r.append("========================================\n");
           r.append("                         University Food Ordering\n");
           r.append("                                   System\n");
           r.append("\n");
           r.append(" Date: ").append(getCurrentDate()).append("                                 Time: ").append(getCurrentTime()).append("\n");
           r.append("========================================\n");
           r.append("Name                      Balance                 Top-up Amount\n");
           r.append(String.format("%-20s%-29.2f%-5.2f RM\n", userName, currentBalance, topUpAmount));
           r.append("\nTotal:").append(String.format("%65.2f RM\n", currentBalance + topUpAmount));
           r.append("========================================\n");
           r.append("                           Have a great day!\n");
           r.append("               If you have any questions or concerns\n");
           r.append("                    please feel free to contact us.\n");
           r.append("                support@universityfoodorders.com\n");
           
           return r.toString();
       }
       else
       {
          JOptionPane.showMessageDialog(null, "User not found. New Balance: ", "Error", JOptionPane.ERROR_MESSAGE);
          return null;
       }
   }
   
   private String getCurrentDate() 
   {
       Date date = new Date();
       return new SimpleDateFormat("dd/MM/yyyy").format(date);
   }
   
   private String getCurrentTime() 
   {
       Date date = new Date();
       return new SimpleDateFormat("hh:mm a").format(date);
   }
}
