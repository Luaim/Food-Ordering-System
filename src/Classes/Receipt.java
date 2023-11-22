package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receipt {
    private String customerName;
    private List<ReceiptItem> items;

    public Receipt() {
        items = new ArrayList<>();
    }

    public Receipt(String customerName) {
        this.customerName = customerName;
        items = new ArrayList<>();
    }

    public void addItem(String itemID, String itemName, double price, int quantity) {
        ReceiptItem item = new ReceiptItem(itemID, itemName, price, quantity);
        items.add(item);
    }

    public String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String getCurrentTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        Date date = new Date();
        return timeFormat.format(date);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (ReceiptItem item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public String generateReceipt() {
        StringBuilder r = new StringBuilder();

        r.append("=====================================\n");
        r.append("                   University Food Ordering\n");
        r.append("                               System\n");
        r.append(" Date: ").append(getCurrentDate()).append("                           Time: ").append(getCurrentTime()).append("\n");
        r.append("=====================================\n");
        r.append("Customer: ").append(customerName).append("\n\n");
        r.append(String.format("%-9s %-20s %-20s %-5s\n", "Item ID", "Item Name", "Quantity", "Price"));
        
        double totalPrice = 0.0;
        
        for (ReceiptItem item : items)
        {
            double itemTotalPrice = item.getPrice() * item.getQuantity();
            r.append(String.format("%-15s %-28s %-14d %-1.2f RM\n", item.getItemID(), item.getItemName(), item.getQuantity(), itemTotalPrice));
            totalPrice += itemTotalPrice;
        }

        r.append("\n");
        r.append(String.format("%-65s%-2.2f RM\n", "Total:", totalPrice));
        r.append("=====================================\n");
        r.append("                    Have a great day! \n");
        r.append("       If you have any questions or concerns \n");
        r.append("            please feel free to contact us. \n");
        r.append("          support@universityfoodorders.com \n");

        return r.toString();
    }

    private static class ReceiptItem {
        private String itemID;
        private String itemName;
        private double price;
        private int quantity;

        public ReceiptItem(String itemID, String itemName, double price, int quantity) {
            this.itemID = itemID;
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemID() {
            return itemID;
        }

        public String getItemName() {
            return itemName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
