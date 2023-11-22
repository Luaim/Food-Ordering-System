package JFrames;

import Classes.*;
import java.util.*;
import javax.swing.*;
import java.awt.print.PrinterException;

public class Admin extends javax.swing.JFrame 
{ 
    private final UpdateProfile updateProfile;
    private UsersTableModel usersTableModel;
    private Receipt receipt;
    private TopUp topUp;
    
    public Admin(String email, String password)
    {
        initComponents();

        updateProfile = new UpdateProfile(email, password, txtEmail, txtName, txtContact, txtPassword);  
        usersTableModel = new UsersTableModel();
        
        loadUsersToTable();
        
        topUp = new TopUp("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt");
        showUserNamesComboBox();
    }   
    
    private void loadUsersToTable()
    {   
        if(usersTableModel == null)
        {
            usersTableModel = new UsersTableModel();
            InfojTable.setModel(usersTableModel);
        }
        else
        {
            usersTableModel.readFromFile();
            usersTableModel.fireTableDataChanged();
        }
    }
    
    public List<Users>getUsersFromTheSource()
    {
        List<Users> usersList = usersTableModel.getUsers();
        return usersList;  
    }
    
    private void showUserNamesComboBox() 
    {
        List<String> userNames = topUp.getUserNames();
         
        if (userNames.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No users found", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(userNames.toArray(new String[0]));
        cmbSelectUser.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashbord = new javax.swing.JPanel();
        btnUserRegistration = new javax.swing.JButton();
        btnTopUPCustomer = new javax.swing.JButton();
        btnGenerateReceipt = new javax.swing.JButton();
        btnNotification = new javax.swing.JButton();
        btnUserRegistration2 = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlProfile = new javax.swing.JPanel();
        lblProfileIcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnUpdateProfile = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        pnlUserRegistration = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InfojTable = new javax.swing.JTable();
        lblName1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        lbEmail1 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        lblContact1 = new javax.swing.JLabel();
        txtContact1 = new javax.swing.JTextField();
        lblUserType = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtPassword1 = new javax.swing.JTextField();
        pnlTopUPCustomer = new javax.swing.JPanel();
        lblSelectUser = new javax.swing.JLabel();
        cmbSelectUser = new javax.swing.JComboBox<>();
        lblBalance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        lblEnterAmount = new javax.swing.JLabel();
        txtTopUPAmount = new javax.swing.JTextField();
        lblRM = new javax.swing.JLabel();
        lblRM1 = new javax.swing.JLabel();
        btnTopUP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DisplayReceipt = new javax.swing.JTextArea();
        lblName2 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        lblNote = new javax.swing.JLabel();
        lblNote1 = new javax.swing.JLabel();
        btnPrint1 = new javax.swing.JButton();
        btnResit = new javax.swing.JButton();
        pnlGenerateReceipt = new javax.swing.JPanel();
        lblCustomerName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptTextArea = new javax.swing.JTextArea();
        btnGenerateReceipt1 = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnReSit = new javax.swing.JButton();
        txtCustomerName = new javax.swing.JTextField();
        lblItemID = new javax.swing.JLabel();
        txtItemID = new javax.swing.JTextField();
        lblItemName = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        lblQuentity = new javax.swing.JLabel();
        txtQuentity = new javax.swing.JTextField();
        pnlNotification = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashbord.setBackground(new java.awt.Color(44, 44, 44));

        btnUserRegistration.setBackground(new java.awt.Color(44, 44, 44));
        btnUserRegistration.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnUserRegistration.setForeground(new java.awt.Color(255, 255, 255));
        btnUserRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/user.png"))); // NOI18N
        btnUserRegistration.setText("User registration");
        btnUserRegistration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUserRegistration.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUserRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserRegistrationActionPerformed(evt);
            }
        });

        btnTopUPCustomer.setBackground(new java.awt.Color(44, 44, 44));
        btnTopUPCustomer.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnTopUPCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnTopUPCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/wallet.png"))); // NOI18N
        btnTopUPCustomer.setText("Top-UP Customer");
        btnTopUPCustomer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTopUPCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTopUPCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopUPCustomerActionPerformed(evt);
            }
        });

        btnGenerateReceipt.setBackground(new java.awt.Color(44, 44, 44));
        btnGenerateReceipt.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnGenerateReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bill.png"))); // NOI18N
        btnGenerateReceipt.setText("Generate Receipt");
        btnGenerateReceipt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerateReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGenerateReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReceiptActionPerformed(evt);
            }
        });

        btnNotification.setBackground(new java.awt.Color(44, 44, 44));
        btnNotification.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnNotification.setForeground(new java.awt.Color(255, 255, 255));
        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/notification-bell.png"))); // NOI18N
        btnNotification.setText("Notification");
        btnNotification.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNotification.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificationActionPerformed(evt);
            }
        });

        btnUserRegistration2.setBackground(new java.awt.Color(44, 44, 44));
        btnUserRegistration2.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnUserRegistration2.setForeground(new java.awt.Color(255, 255, 255));
        btnUserRegistration2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/admin.png"))); // NOI18N
        btnUserRegistration2.setText("Profile");
        btnUserRegistration2.setBorder(new javax.swing.border.MatteBorder(null));
        btnUserRegistration2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUserRegistration2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserRegistration2ActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(44, 44, 44));
        btnLogOut.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/log-out_1.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashbordLayout = new javax.swing.GroupLayout(Dashbord);
        Dashbord.setLayout(DashbordLayout);
        DashbordLayout.setHorizontalGroup(
            DashbordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnUserRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTopUPCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNotification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGenerateReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUserRegistration2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DashbordLayout.setVerticalGroup(
            DashbordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashbordLayout.createSequentialGroup()
                .addComponent(btnUserRegistration2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUserRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnTopUPCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnGenerateReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Dashbord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 372));

        lblProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/manager.png"))); // NOI18N

        lblName.setText("Name");

        lblEmail.setText("Email");

        lblContact.setText("Contact");

        lblPassword.setText("Password");

        btnUpdateProfile.setText("Update");
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProfileLayout = new javax.swing.GroupLayout(pnlProfile);
        pnlProfile.setLayout(pnlProfileLayout);
        pnlProfileLayout.setHorizontalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfileLayout.createSequentialGroup()
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProfileLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblProfileIcon))
                    .addGroup(pnlProfileLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlProfileLayout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProfileLayout.createSequentialGroup()
                                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlProfileLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnUpdateProfile)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        pnlProfileLayout.setVerticalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfileLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnUpdateProfile)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", pnlProfile);

        usersTableModel = new UsersTableModel();
        InfojTable.setModel(usersTableModel);
        InfojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfojTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(InfojTable);

        lblName1.setText("Name");

        lbEmail1.setText("Email");

        lblContact1.setText("Contact");

        lblUserType.setText("User Type");

        lblPassword1.setText("Password");

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "vendor", "customer", "runner" }));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserRegistrationLayout = new javax.swing.GroupLayout(pnlUserRegistration);
        pnlUserRegistration.setLayout(pnlUserRegistrationLayout);
        pnlUserRegistrationLayout.setHorizontalGroup(
            pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
            .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserRegistrationLayout.createSequentialGroup()
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addComponent(lbEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate))
                            .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addComponent(lblContact1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserRegistrationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addContainerGap())))
        );
        pnlUserRegistrationLayout.setVerticalGroup(
            pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail1)
                            .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContact1)
                            .addComponent(txtContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword1)
                            .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserRegistrationLayout.createSequentialGroup()
                        .addGroup(pnlUserRegistrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("User registration", pnlUserRegistration);

        lblSelectUser.setText("Select User");

        cmbSelectUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectUserActionPerformed(evt);
            }
        });

        lblBalance.setText("Balance");

        lblEnterAmount.setText("Enter Amount");

        lblRM.setText("RM");

        lblRM1.setText("RM");

        btnTopUP.setText("Top UP");
        btnTopUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopUPActionPerformed(evt);
            }
        });

        DisplayReceipt.setColumns(20);
        DisplayReceipt.setRows(5);
        jScrollPane2.setViewportView(DisplayReceipt);

        lblName2.setText("Name");

        lblNote.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        lblNote.setForeground(new java.awt.Color(255, 0, 0));
        lblNote.setText("Note:");

        lblNote1.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        lblNote1.setText("Aftert Top-UP a Receipt Will Automaticly Send To The Customer.");

        btnPrint1.setText("Print");
        btnPrint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrint1ActionPerformed(evt);
            }
        });

        btnResit.setText("Resit");
        btnResit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTopUPCustomerLayout = new javax.swing.GroupLayout(pnlTopUPCustomer);
        pnlTopUPCustomer.setLayout(pnlTopUPCustomerLayout);
        pnlTopUPCustomerLayout.setHorizontalGroup(
            pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                        .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEnterAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSelectUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectUser, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                                .addComponent(txtTopUPAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRM1))
                            .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnTopUP)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopUPCustomerLayout.createSequentialGroup()
                        .addComponent(btnResit)
                        .addGap(10, 10, 10)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrint1)
                    .addComponent(lblNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopUPCustomerLayout.setVerticalGroup(
            pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlTopUPCustomerLayout.createSequentialGroup()
                        .addComponent(lblSelectUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSelectUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRM))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblEnterAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTopUPAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRM1))
                        .addGap(18, 18, 18)
                        .addComponent(btnTopUP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResit)
                            .addComponent(btnPrint1))
                        .addGap(19, 19, 19)))
                .addGap(18, 18, 18)
                .addGroup(pnlTopUPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNote)
                    .addComponent(lblNote1))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Top-UP Customer", pnlTopUPCustomer);

        lblCustomerName.setText("Customer Name");

        receiptTextArea.setColumns(20);
        receiptTextArea.setRows(5);
        jScrollPane1.setViewportView(receiptTextArea);

        btnGenerateReceipt1.setText("Add");
        btnGenerateReceipt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReceipt1ActionPerformed(evt);
            }
        });

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnReSit.setText("Resit");
        btnReSit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReSitActionPerformed(evt);
            }
        });

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        lblItemID.setText("Item ID");

        txtItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIDActionPerformed(evt);
            }
        });

        lblItemName.setText("Item Name");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        lblPrice.setText("Price");

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        lblQuentity.setText("Quentity");

        txtQuentity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuentityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGenerateReceiptLayout = new javax.swing.GroupLayout(pnlGenerateReceipt);
        pnlGenerateReceipt.setLayout(pnlGenerateReceiptLayout);
        pnlGenerateReceiptLayout.setHorizontalGroup(
            pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGenerateReceiptLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerName)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemID)
                    .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemName)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlGenerateReceiptLayout.createSequentialGroup()
                            .addComponent(btnPrint)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSend))
                        .addGroup(pnlGenerateReceiptLayout.createSequentialGroup()
                            .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrice))
                            .addGap(13, 13, 13)
                            .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuentity)
                                .addComponent(txtQuentity, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlGenerateReceiptLayout.createSequentialGroup()
                            .addComponent(btnReSit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerateReceipt1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGenerateReceiptLayout.setVerticalGroup(
            pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGenerateReceiptLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGenerateReceiptLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblCustomerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addComponent(lblItemID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addComponent(lblItemName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 15, Short.MAX_VALUE)
                .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(lblQuentity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuentity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReSit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerateReceipt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGenerateReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Generate Receipt", pnlGenerateReceipt);

        jLabel1.setText(" received messages");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel2.setText("Send to");

        jLabel3.setText("Message");

        jButton1.setText("Send");

        javax.swing.GroupLayout pnlNotificationLayout = new javax.swing.GroupLayout(pnlNotification);
        pnlNotification.setLayout(pnlNotificationLayout);
        pnlNotificationLayout.setHorizontalGroup(
            pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addComponent(jTextField1)
                        .addGroup(pnlNotificationLayout.createSequentialGroup()
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlNotificationLayout.setVerticalGroup(
            pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNotificationLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(pnlNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", pnlNotification);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -40, 510, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegistrationActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnUserRegistrationActionPerformed

    private void btnGenerateReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReceiptActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnGenerateReceiptActionPerformed

    private void btnTopUPCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUPCustomerActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnTopUPCustomerActionPerformed

    private void btnNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificationActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnNotificationActionPerformed

    private void btnUserRegistration2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserRegistration2ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnUserRegistration2ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        this.dispose();
        
        Login li = new Login();
        li.setVisible(true);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
  
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed
        
        String name = txtName.getText();
        String email = txtEmail.getText();
        String contact = txtContact.getText();
        String password = txtPassword.getText();
        
        
        updateProfile.updateProfile(name, email, contact, password);
        
        JOptionPane.showMessageDialog(this, "Profile updated successfully.");

    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtName1.getText();
        String email = txtEmail1.getText();
        String contact = txtContact1.getText();
        String password = txtPassword1.getText();
        String userType = cmbUserType.getSelectedItem().toString();
        
        if(name.isEmpty() || email.isEmpty() || contact.isEmpty() || password.isEmpty() || userType.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill all the requirements", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Users newUser = new Users(name, email, contact, password, userType); 
        usersTableModel.addUser(newUser);
        
        loadUsersToTable();
        
        JOptionPane.showMessageDialog(this, "User registered successfully.");
        
        txtName1.setText("");
        txtEmail1.setText("");
        txtContact1.setText("");
        txtPassword1.setText("");
        cmbUserType.setSelectedIndex(0);      
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        txtName1.setText("");
        txtEmail1.setText("");
        txtContact1.setText("");
        txtPassword1.setText("");
        
        cmbUserType.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = InfojTable.getSelectedRow();
        
        if(selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a user to delete", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        usersTableModel.removePerson(selectedRow);
        JOptionPane.showMessageDialog(this, "User deleted successfully");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void InfojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfojTableMouseClicked
        int selectedRow = InfojTable.getSelectedRow();
        
        if(selectedRow >=0)
        {
            Users SU = usersTableModel.getPerson(selectedRow);

            txtName1.setText(SU.getName());
            txtEmail1.setText(SU.getEmail());
            txtContact1.setText(SU.getContact());
            txtPassword1.setText(SU.getPassword());
            String userType = SU.getUserType();
            cmbUserType.setSelectedItem(userType); 
        }
    }//GEN-LAST:event_InfojTableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectedRow = InfojTable.getSelectedRow();
        
        if(selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a user to update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String name = txtName1.getText();
        String email = txtEmail1.getText();
        String contact = txtContact1.getText();
        String password = txtPassword1.getText();
        String userType = cmbUserType.getSelectedItem().toString();
        
        if(name.isEmpty() || email.isEmpty() || contact.isEmpty() || password.isEmpty() || userType.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill all the requirements", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Users updatedUser = new Users(name, email, contact, password, userType);
        usersTableModel.updateUser(selectedRow, updatedUser);
        
        JOptionPane.showMessageDialog(this, "User updated successfully.");
        
        txtName1.setText("");
        txtEmail1.setText("");
        txtContact1.setText("");
        txtPassword1.setText("");
        cmbUserType.setSelectedIndex(0);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void txtItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemIDActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtQuentityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuentityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuentityActionPerformed

    private void btnGenerateReceipt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReceipt1ActionPerformed
        String customerName = txtCustomerName.getText();
        String itemID = txtItemID.getText();
        String itemName = txtItemName.getText();

        double price;
        try
        {
            price = Double.parseDouble(txtPrice.getText());
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       int quantity;
        try
        {
            quantity = Integer.parseInt(txtQuentity.getText());
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid price", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(customerName.isEmpty() || itemID.isEmpty() || itemName.isEmpty() || price <= 0.0 || quantity <=0)
        {
            JOptionPane.showMessageDialog(this, "Please fill all the requirements", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(receipt == null)
        {
            receipt = new Receipt(customerName);
        }
        
        receipt.addItem(itemID, itemName, price, quantity);
        receiptTextArea.setText(receipt.generateReceipt());
        
        txtItemID.setText("");
        txtItemName.setText("");
        txtPrice.setText("");
        txtQuentity.setText("");
    }//GEN-LAST:event_btnGenerateReceipt1ActionPerformed

    private void btnReSitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReSitActionPerformed
        
        txtCustomerName.setText("");
        txtItemID.setText("");
        txtItemName.setText("");
        txtPrice.setText("");
        txtQuentity.setText("");
        receiptTextArea.setText("");
    }//GEN-LAST:event_btnReSitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       
        if(receiptTextArea.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Can not print an empty receipt", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            receiptTextArea.print();
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(this, "Error while printing", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnTopUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopUPActionPerformed
        
        String selectedUser = cmbSelectUser.getSelectedItem() != null? cmbSelectUser.getSelectedItem().toString(): null;
        
        
        if (selectedUser == null || selectedUser.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please select a user", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        TopUp topUp = new TopUp("C:/APU/Year 2/SEMESTER 1/Assignments/Object Oriented Development with Java/University Food Ordering System/CustomerBalance.txt");

        double topUpAmount;
        try 
        {
            topUpAmount = Double.parseDouble(txtTopUPAmount.getText());
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid top-up amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String receipt = topUp.generateReceipt(selectedUser, topUpAmount);
        
        if (receipt != null) 
        {
            DisplayReceipt.setText(receipt);
        }
        
        topUp.topUpBalance(selectedUser, topUpAmount);
        //updateBalanceOnUI(userName);
    }//GEN-LAST:event_btnTopUPActionPerformed

    private void cmbSelectUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectUserActionPerformed
         Object selectedObject = cmbSelectUser.getSelectedItem();
        
        if (selectedObject != null) 
        {
            String selectedUser = selectedObject.toString();
            
            if(!selectedUser.isEmpty())
            {
                 topUp.updateUIForSelectedUser(selectedUser, txtName2, txtBalance);
            }
        }
    }//GEN-LAST:event_cmbSelectUserActionPerformed

    private void btnPrint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrint1ActionPerformed
       
         if(DisplayReceipt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Can not print an empty receipt", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
            receiptTextArea.print();
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(this, "Error while printing", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrint1ActionPerformed

    private void btnResitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResitActionPerformed
       
        cmbSelectUser.setSelectedIndex(-1);
        txtName2.setText("");
        txtBalance.setText("");
        txtTopUPAmount.setText("");
        DisplayReceipt.setText("");
    }//GEN-LAST:event_btnResitActionPerformed

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Admin("luai@gmail.com", "123").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashbord;
    private javax.swing.JTextArea DisplayReceipt;
    private javax.swing.JTable InfojTable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerateReceipt;
    private javax.swing.JButton btnGenerateReceipt1;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNotification;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnPrint1;
    private javax.swing.JButton btnReSit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnResit;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnTopUP;
    private javax.swing.JButton btnTopUPCustomer;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton btnUserRegistration;
    private javax.swing.JButton btnUserRegistration2;
    private javax.swing.JComboBox<String> cmbSelectUser;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbEmail1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContact1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnterAmount;
    private javax.swing.JLabel lblItemID;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblNote1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProfileIcon;
    private javax.swing.JLabel lblQuentity;
    private javax.swing.JLabel lblRM;
    private javax.swing.JLabel lblRM1;
    private javax.swing.JLabel lblSelectUser;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JPanel pnlGenerateReceipt;
    private javax.swing.JPanel pnlNotification;
    private javax.swing.JPanel pnlProfile;
    private javax.swing.JPanel pnlTopUPCustomer;
    private javax.swing.JPanel pnlUserRegistration;
    private javax.swing.JTextArea receiptTextArea;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuentity;
    private javax.swing.JTextField txtTopUPAmount;
    // End of variables declaration//GEN-END:variables


}
