package JFrames;


import JFrames.Customer;
import JFrames.Admin;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Login extends javax.swing.JFrame 
{
    private boolean passwordVisible = false;
     
    public Login() 
    {  
        initComponents();
        
        lblEyeIcon.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                togglePasswordVisibility();
            }
        });
    }
    private void togglePasswordVisibility() 
    {
        if (passwordVisible) 
        {
            txtPassword.setEchoChar('\u25CF'); 
        } 
        else 
        {
            txtPassword.setEchoChar((char) 0);
        }
        passwordVisible = !passwordVisible;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblEyeIcon = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbltxt2 = new javax.swing.JLabel();
        lblSystemName = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblHello = new javax.swing.JLabel();
        lbltxt1 = new javax.swing.JLabel();
        lblPasswordIcon = new javax.swing.JLabel();
        lblLogInIcon = new javax.swing.JLabel();
        lblEmaiIcon1 = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(73, 49, 151));
        btnExit.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 80, 30));

        btnLogin.setBackground(new java.awt.Color(73, 49, 151));
        btnLogin.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, 30));

        lblEyeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/show (1).png"))); // NOI18N
        getContentPane().add(lblEyeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 210, -1, 30));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 30));

        lblPassword.setFont(new java.awt.Font("Monotype Corsiva", 0, 19)); // NOI18N
        lblPassword.setText("Password");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 20));

        lblEmail.setFont(new java.awt.Font("Monotype Corsiva", 0, 19)); // NOI18N
        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, 30));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 220, 30));

        lbltxt2.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        lbltxt2.setForeground(new java.awt.Color(255, 255, 255));
        lbltxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltxt2.setText(" to use the system");
        getContentPane().add(lbltxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 290, 50));

        lblSystemName.setFont(new java.awt.Font("French Script MT", 3, 18)); // NOI18N
        lblSystemName.setForeground(new java.awt.Color(255, 255, 255));
        lblSystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemName.setText("University Food Ordering System");
        getContentPane().add(lblSystemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 290, 50));

        lblLogin.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Log in");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, 40));

        lblLogo.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/20b05105-5e96-4e44-8dfa-739c71661dd0-7.jpg"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 230, 140));

        lblHello.setFont(new java.awt.Font("Segoe Print", 3, 36)); // NOI18N
        lblHello.setForeground(new java.awt.Color(255, 255, 255));
        lblHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHello.setText("Hello");
        getContentPane().add(lblHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 140, 80));

        lbltxt1.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        lbltxt1.setForeground(new java.awt.Color(255, 255, 255));
        lbltxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltxt1.setText("Log in with your personal details");
        getContentPane().add(lbltxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 290, 50));

        lblPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/padlock.png"))); // NOI18N
        getContentPane().add(lblPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 30));
        getContentPane().add(lblLogInIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        lblEmaiIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/email.png"))); // NOI18N
        getContentPane().add(lblEmaiIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 30));

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login.png"))); // NOI18N
        getContentPane().add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 570, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = txtEmail.getText();
        String password = new String(txtPassword.getPassword());

        Classes.Login users = new Classes.Login();
        String role = users.authenticateUser(email, password);

        if (email.isEmpty() || password.isEmpty() || role.equals("Invalid email and password"))
        {
            JOptionPane.showMessageDialog(this, "Incorrect email or password.");
        }
        else if(role.equals("admin"))
        {
            Admin ad = new Admin(email, password);
            ad.setVisible(true);
            this.dispose();
        }
        else if(role.equals("vendor"))
        {
            Vendor ve = new Vendor();
            ve.setVisible(true);
            this.dispose();
        }
        else if (role.equals("customer"))
        {
            Customer cu = new Customer();
            cu.setVisible(true);
            this.dispose();
        }
        else if(role.equals("runner"))
        {
            runner ru = new runner();
            ru.setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    
    public static void main(String args[]) 
    {

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblEmaiIcon1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEyeIcon;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblLogInIcon;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordIcon;
    private javax.swing.JLabel lblSystemName;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lbltxt1;
    private javax.swing.JLabel lbltxt2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
