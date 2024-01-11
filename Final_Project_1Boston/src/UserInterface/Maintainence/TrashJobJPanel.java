/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Maintainence;

import business.Business;
import javax.swing.JPanel;

/**
 *
 * @author sanatpopli
 */
public class TrashJobJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrashJobJPanel
     */
    

    /**
     * Creates new form TrashJobJPanel
     */
    JPanel workArea;
    Business business;
    public TrashJobJPanel(JPanel workArea, Business business) {
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

        uidjLabel = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtUid = new javax.swing.JTextField();
        txtHours = new javax.swing.JTextField();
        txtTax = new javax.swing.JTextField();
        Yes = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContent = new javax.swing.JTable();
        namejLabel = new javax.swing.JLabel();
        btnAmbulance = new javax.swing.JButton();
        payjLabel = new javax.swing.JLabel();
        btnPolice = new javax.swing.JButton();
        jobdonejLabel = new javax.swing.JLabel();
        btnFire = new javax.swing.JButton();
        taxjLabel = new javax.swing.JLabel();
        btnDownload = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 153));

        uidjLabel.setText("UID");

        Yes.setText("Job Done");

        jLabel6.setText("Complaints/Raise Request");

        jLabel1.setText("Hi,Electrician");

        tblContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Complainee", "Complaint"
            }
        ));
        jScrollPane1.setViewportView(tblContent);

        namejLabel.setText("Name");

        btnAmbulance.setBackground(new java.awt.Color(255, 204, 204));
        btnAmbulance.setText("Ambulance");

        payjLabel.setText("Pay");

        btnPolice.setBackground(new java.awt.Color(255, 204, 204));
        btnPolice.setText("Police");

        jobdonejLabel.setText("Hours");

        btnFire.setBackground(new java.awt.Color(255, 204, 204));
        btnFire.setText("Fire");

        taxjLabel.setText("Tax");

        btnDownload.setBackground(new java.awt.Color(255, 204, 204));
        btnDownload.setText("Download");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payjLabel)
                            .addComponent(namejLabel)
                            .addComponent(taxjLabel)
                            .addComponent(jobdonejLabel)
                            .addComponent(uidjLabel))
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtSalary)
                            .addComponent(txtHours)
                            .addComponent(txtTax)
                            .addComponent(txtUid))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAmbulance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPolice)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnFire)))))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(Yes)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnDownload)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(namejLabel)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(payjLabel)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jobdonejLabel)
                                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taxjLabel)
                                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uidjLabel)
                            .addComponent(txtUid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Yes)
                        .addGap(72, 72, 72)))
                .addComponent(btnDownload)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPolice)
                    .addComponent(btnAmbulance)
                    .addComponent(btnFire))
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Yes;
    private javax.swing.JButton btnAmbulance;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnFire;
    private javax.swing.JButton btnPolice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jobdonejLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel payjLabel;
    private javax.swing.JLabel taxjLabel;
    private javax.swing.JTable tblContent;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtUid;
    private javax.swing.JLabel uidjLabel;
    // End of variables declaration//GEN-END:variables
}
