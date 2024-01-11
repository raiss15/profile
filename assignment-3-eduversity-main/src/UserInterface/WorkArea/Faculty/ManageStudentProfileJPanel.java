/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Faculty;

import Business.Business;
import Business.Course.Course;
import Business.Course.CourseGrading;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhagya
 */
public class ManageStudentProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStudentProfileJPanel
     */
    

    /**
     * Creates new form ManageStudentProfileJPanel
     */
    JPanel workArea;
    Business business;
    ProfessorProfile professorProfile;
    public ManageStudentProfileJPanel(JPanel workArea, Business business, ProfessorProfile professorProfile) {
        initComponents();
        this.workArea=workArea;
        this.business=business;
        this.professorProfile = professorProfile;
        populateTable();
        System.out.println("prof id = "+ professorProfile.getProfId());
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblStudentManagementForProf.getModel();
        model.setRowCount(0);
        
        StudentDirectory studentDirectory = business.getStudentDirectory();
       
        for(StudentProfile sp : professorProfile.getStudentList()){
            for(Course c : sp.getCoursesTaken()){
                for(CourseGrading cg : c.getCourseGradeList()){
                    int id1 = Integer.valueOf(c.getProfId());
                    int id2 = Integer.valueOf(professorProfile.getProfId());
                    if((id1==id2) && (cg.getStudentId().equals(sp.getNuid()))){
                    Object[] row = new Object[5];    
                    row[0] = sp;
                    row[1] = sp.getNuid();
                    row[2] = c.getCourseName();
                    row[3] = c.getOfferingTerm();
                    row[4] = cg.getGrades();
                    model.addRow(row);
                }
                }
               
               
            }            
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

        lblManageStudentProfile = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentManagementForProf = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAddGrades = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblManageStudentProfile.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblManageStudentProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageStudentProfile.setText("Manage Student Profile");

        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSearch.setText("Search by Student Name");

        tblStudentManagementForProf.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblStudentManagementForProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student Name", "NU ID", "Course", "Term", "Grades"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentManagementForProf);

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddGrades.setBackground(new java.awt.Color(204, 255, 204));
        btnAddGrades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddGrades.setText("Add Grades");
        btnAddGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGradesActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageStudentProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblSearch))
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddGrades, btnBack});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblManageStudentProfile)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddGrades))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddGrades, btnBack});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout= (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddGradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGradesActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblStudentManagementForProf.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a student to add Grades!");
        }
        DefaultTableModel model = (DefaultTableModel) tblStudentManagementForProf.getModel();
        StudentProfile selectSp = (StudentProfile) model.getValueAt(selectedRowIndex, 0);
        if(selectSp!=null){
            FacultyGradeAreaWorkJPanel panel = new FacultyGradeAreaWorkJPanel(workArea, business, selectSp, professorProfile);
            workArea.add("StudentCourseRegistrationJPanel", panel);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
        }
    }//GEN-LAST:event_btnAddGradesActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(txtSearch.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Please enter a valid student name!");
        
        String sName = txtSearch.getText();
        DefaultTableModel model = (DefaultTableModel) tblStudentManagementForProf.getModel();
        model.setRowCount(0);
        
        StudentDirectory studentDirectory = business.getStudentDirectory();
        for(StudentProfile sp : professorProfile.getStudentList()){
            for(Course c : sp.getCoursesTaken()){
                for(CourseGrading cg : c.getCourseGradeList()){
                    String studentName = sp.getFirstName()+" "+sp.getLastName();
                                if(studentName.equals(sName)){
                                    int id1 = Integer.valueOf(c.getProfId());
                                    int id2 = Integer.valueOf(professorProfile.getProfId());
                                    if((id1==id2) && (cg.getStudentId().equals(sp.getNuid()))){
                                    Object[] row = new Object[5];    
                                    row[0] = sp;
                                    row[1] = sp.getNuid();
                                    row[2] = c.getCourseName();
                                    row[3] = c.getOfferingTerm();
                                    row[4] = cg.getGrades();
                                    model.addRow(row);
                                }
                                }
                }
            }
            
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddGrades;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageStudentProfile;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblStudentManagementForProf;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
