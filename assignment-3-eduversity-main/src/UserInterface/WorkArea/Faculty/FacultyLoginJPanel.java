/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Faculty;

import Business.Business;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.Profile;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class FacultyLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyLoginJPanel
     */
    JPanel workArea;
    Business business;
    public FacultyLoginJPanel(JPanel workArea, Business business) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
    }

    /**
     * Creates new form FacultyLoginJPanel
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblNewFaculty = new javax.swing.JLabel();
        btnSignupFaculty = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Faculty Login");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("User Name : ");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password : ");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblNewFaculty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNewFaculty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNewFaculty.setText("Not a Faculty Member?");

        btnSignupFaculty.setText("Sign Up");
        btnSignupFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupFacultyActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewFaculty)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(btnSignupFaculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnBack)))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnLogin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUserName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogin)
                        .addGap(66, 66, 66)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnLogin)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewFaculty)
                    .addComponent(btnSignupFaculty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(180, 180, 180))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnLogin});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout= (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSignupFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupFacultyActionPerformed
        FacultySignUpJPanel panel=new FacultySignUpJPanel(workArea, business);
        workArea.add("FacultySignUpJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnSignupFacultyActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            // TODO add your handling code here:
            String uName = txtUserName.getText();
            String pwd = txtPassword.getText();
            MessageDigest messageDigest =  MessageDigest.getInstance("SHA-256");
            byte[] md = messageDigest.digest(pwd.getBytes());
            BigInteger bigInt = new BigInteger(1, md);
            String hashedPassword = bigInt.toString(16);
            UserAccountDirectory uad = business.getUserAccountDirectory();
            UserAccount uAccount = uad.AuthenticateUser(uName, hashedPassword);
            if(uAccount == null){
                JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                return;
            }
            Profile profile = uAccount.getAssociatedPersonProfile();
            String r = uAccount.getRole();
            if(profile instanceof ProfessorProfile){
            ProfessorProfile professorProfile = (ProfessorProfile) profile;
            FacultyDashboardJPanel panel=new FacultyDashboardJPanel(workArea, business, professorProfile);
            workArea.add("FacultyDashboardJPanel", panel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
        }else{
                JOptionPane.showMessageDialog(null, "This is a professor access system only!", "Warning", JOptionPane.ERROR_MESSAGE);
                txtUserName.setText("");
                txtPassword.setText("");
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FacultyLoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignupFaculty;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNewFaculty;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
