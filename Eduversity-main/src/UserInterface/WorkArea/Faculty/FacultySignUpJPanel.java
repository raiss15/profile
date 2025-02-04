/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Faculty;

import Business.Business;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.ProfessorProfile;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class FacultySignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultySignUpJPanel
     */
   

    /**
     * Creates new form FacultySignUpJPanel
     */
    JPanel workArea;
    Business business;
    
    public FacultySignUpJPanel(JPanel workArea, Business business) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSignup = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSpecialisation = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblLocationNumber = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtSpecialisation = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfPassword = new javax.swing.JPasswordField();
        txtProfId = new javax.swing.JTextField();
        lblProfId = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblSignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignup.setText("Faculty Sign Up");

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstName.setText("First Name  :");

        lblSpecialisation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSpecialisation.setText("Specialisation : ");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastName.setText("Last Name : ");

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUserName.setText("User Name : ");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setText("Password : ");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email : ");

        lblLocation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLocation.setText("Location : ");

        lblLocationNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLocationNumber.setText("Contact Number : ");

        lblConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblConfirmPassword.setText("Confirm Password :");

        btnSignUp.setText("SignUp");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblProfId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProfId.setText("Professor Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLocationNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addComponent(lblProfId, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addComponent(txtEmail)
                    .addComponent(txtUserName)
                    .addComponent(txtLocation)
                    .addComponent(txtSpecialisation)
                    .addComponent(txtContactNumber)
                    .addComponent(txtPassword)
                    .addComponent(txtConfPassword)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtProfId))
                .addContainerGap(275, Short.MAX_VALUE))
            .addComponent(lblSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblSignup)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfId)
                    .addComponent(txtProfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialisation)
                    .addComponent(txtSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocationNumber)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnSignUp)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
      
        String profId = txtProfId.getText();
        String fName = txtFirstName.getText();
        String lName = txtLastName.getText();
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String confPassword = txtConfPassword.getText();
        String email = txtEmail.getText();
        String location = txtLocation.getText();
        String specialization = txtSpecialisation.getText();
        String contactNumber = txtContactNumber.getText();
        if(!(password.equalsIgnoreCase(confPassword))){
            JOptionPane.showMessageDialog(null, "Passwords do not match!","Alert", JOptionPane.ERROR_MESSAGE);
        }
        
        PersonDirectory personDirectory = business.getPersonDirectory();
        Person person01 = personDirectory.newPerson("Prof-"+fName);
        ProfessorDirectory professorDirectory = business.getProfessorDirectory();
        ProfessorProfile professorProfile01 = professorDirectory.newProfessorProfile(person01);
        professorProfile01.setProfId(profId);
        professorProfile01.setEmailId(email);
        professorProfile01.setFirstName(fName);
        professorProfile01.setLastName(lName);
        professorProfile01.setLocation(location);
        professorProfile01.setSpecialization(specialization);
        professorProfile01.setUsername(username);
        professorProfile01.setPassword(password);
        professorProfile01.setContactNumber(contactNumber);
        
        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount ua = uad.newUserAccount(professorProfile01, username,password);
        if(ua!=null){
            FacultyDashboardJPanel panel = new FacultyDashboardJPanel(workArea, business, professorProfile01);
            workArea.add("FacultyDashboardJPanel", panel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
        }else{
            JOptionPane.showMessageDialog(null, "Professor profile not created.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLocationNumber;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProfId;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JLabel lblSpecialisation;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtConfPassword;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtProfId;
    private javax.swing.JTextField txtSpecialisation;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
