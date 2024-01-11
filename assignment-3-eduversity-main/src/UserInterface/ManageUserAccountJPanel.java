/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Business;
import Business.Course.Course;
import Business.Course.CourseGrading;
import Business.Employer.EmployerLoginJPanel;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentProfile;
import UserInterface.Student.StudentLoginJPanel;
import UserInterface.WorkArea.Admin.AdminLoginJPanel;
import UserInterface.WorkArea.Faculty.FacultyLoginJPanel;
import UserInterface.WorkArea.GraduateCertificationAuthority.GCALoginJPanel;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     * 

     */
    
     private JPanel workArea;
     private Business business;
    

    ManageUserAccountJPanel(JPanel workArea, Business business) {
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

        lblManageUserAccount = new javax.swing.JLabel();
        btnFaculty = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        lblselectrole = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnCertificationAuthority = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblManageUserAccount.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblManageUserAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageUserAccount.setText("Manage User Account");

        btnFaculty.setBackground(new java.awt.Color(204, 255, 204));
        btnFaculty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFaculty.setText("Manage Professor");
        btnFaculty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyActionPerformed(evt);
            }
        });

        btnStudent.setBackground(new java.awt.Color(204, 255, 204));
        btnStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnStudent.setText("Manage Student");
        btnStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(204, 255, 204));
        btnEmployee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmployee.setText("Manage Employer");
        btnEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        lblselectrole.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblselectrole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblselectrole.setText("Choose Role");

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(204, 255, 204));
        btnAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnCertificationAuthority.setBackground(new java.awt.Color(204, 255, 204));
        btnCertificationAuthority.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCertificationAuthority.setText("Certification Authority");
        btnCertificationAuthority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertificationAuthorityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblselectrole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblManageUserAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmin))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCertificationAuthority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnBack, btnCertificationAuthority, btnFaculty, btnStudent});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblManageUserAccount)
                .addGap(47, 47, 47)
                .addComponent(lblselectrole)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFaculty)
                    .addComponent(btnStudent)
                    .addComponent(btnEmployee))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAdmin)
                    .addComponent(btnCertificationAuthority))
                .addContainerGap(260, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnEmployee, btnFaculty, btnStudent});

    }// </editor-fold>//GEN-END:initComponents

    private void btnFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyActionPerformed
        // TODO add your handling code here:
        
        FacultyLoginJPanel panel=new FacultyLoginJPanel(workArea,business);
        workArea.add("FacultyLoginJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnFacultyActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        
        StudentLoginJPanel panel = new StudentLoginJPanel(workArea, business);
        workArea.add("StudentLoginPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
        EmployerLoginJPanel panel=new EmployerLoginJPanel(workArea,business);
        workArea.add("LoginEmployerJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout= (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        AdminLoginJPanel panel = new AdminLoginJPanel(workArea, business);
        workArea.add("AdminLoginJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnCertificationAuthorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertificationAuthorityActionPerformed
        // TODO add your handling code here:
        GCALoginJPanel panel  = new GCALoginJPanel(workArea, business);
        workArea.add("GCALoginJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnCertificationAuthorityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCertificationAuthority;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnFaculty;
    private javax.swing.JButton btnStudent;
    private javax.swing.JLabel lblManageUserAccount;
    private javax.swing.JLabel lblselectrole;
    // End of variables declaration//GEN-END:variables
}
