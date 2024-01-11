/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Faculty;

import Business.Business;
import Business.Course.Course;
import Business.Profiles.ProfessorProfile;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCourseJPanel
     */
    

    /**
     * Creates new form ManageCourseJPanel
     */
    JPanel workArea;
    Business business;
    ProfessorProfile professorProfile;
    public ManageCourseJPanel(JPanel workArea, Business business, ProfessorProfile professorProfile) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
        this.professorProfile = professorProfile;
        populateTable();
        System.out.println(professorProfile.toString());
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblProfCourseList.getModel();
        model.setRowCount(0);
        
        for(Course c : professorProfile.getCoursesOffered()){
            Object[] row = new Object[5];
            row[0] = c;
            row[1] = c.getCrn();
            row[2] = c.getOfferingTerm();
            row[3] = c.getOfferingDegree();
            row[4] = c.getCourseAvailableforPrograms();
            
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageCourse = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfCourseList = new javax.swing.JTable();
        btnViewCourse = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblManageCourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblManageCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCourse.setText("Manage Course");

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblProfCourseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "CRN", "Term", "Degree", "Availability For"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProfCourseList);

        btnViewCourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewCourse.setText("View Course");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        btnAddCourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManageCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227)
                        .addComponent(btnAddCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCourse, btnBack, btnViewCourse});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblManageCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCourse)
                    .addComponent(btnAddCourse)
                    .addComponent(btnBack))
                .addGap(322, 322, 322))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCourse, btnBack, btnViewCourse});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        ManageIndividualCourseFacultyJPanel panel = new ManageIndividualCourseFacultyJPanel(workArea, business, professorProfile);
        workArea.add("ManageIndividualCourseFacultyJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProfCourseList.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblProfCourseList.getModel();
        Course selectedCourse = (Course) model.getValueAt(selectedRowIndex, 0);
        
        if(selectedCourse != null){
            FacultyViewCourseJPanel panel = new FacultyViewCourseJPanel(workArea, business, professorProfile,selectedCourse);
            workArea.add("FacultyViewCourseJPanel", panel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
        }
    }//GEN-LAST:event_btnViewCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewCourse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageCourse;
    private javax.swing.JTable tblProfCourseList;
    // End of variables declaration//GEN-END:variables
}
