/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.InsCov;

/**
 *
 * @author Admin
 */
public class InsCovJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsCovJPanel
     */
    
    InsCov inscov;
    public InsCovJPanel(InsCov inscov) {
        initComponents();
        this.inscov = inscov;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblINCTittle = new javax.swing.JLabel();
        lblcompanyname = new javax.swing.JLabel();
        lblcropid = new javax.swing.JLabel();
        lblnumber = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblpremium = new javax.swing.JLabel();
        lbldeductable = new javax.swing.JLabel();
        txtcompanyname = new javax.swing.JTextField();
        txtcropid = new javax.swing.JTextField();
        txtnumber = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtpremium = new javax.swing.JTextField();
        txtdeductable = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblbenefit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtabenefit = new javax.swing.JTextArea();

        lblINCTittle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblINCTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblINCTittle.setText("Insurance Coverage");

        lblcompanyname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcompanyname.setText("Company Name : ");

        lblcropid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcropid.setText("Corporate Id  :");

        lblnumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnumber.setText("Number  :");

        lbladdress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladdress.setText("Address :");

        lblpremium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpremium.setText("Premium  :");

        lbldeductable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldeductable.setText("Deductable :");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblbenefit.setText("Benefits : ");

        txtabenefit.setColumns(20);
        txtabenefit.setRows(5);
        jScrollPane1.setViewportView(txtabenefit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbldeductable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblpremium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbladdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblcropid, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(lblcompanyname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblbenefit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtpremium)
                        .addComponent(txtdeductable)
                        .addComponent(txtcompanyname, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(txtcropid)
                        .addComponent(txtnumber)
                        .addComponent(txtaddress)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblINCTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblINCTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcompanyname)
                    .addComponent(txtcompanyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcropid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcropid))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladdress)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpremium)
                    .addComponent(txtpremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldeductable)
                    .addComponent(txtdeductable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbenefit)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        inscov.setCorpid(txtcropid.getText());
        inscov.setCompanyname(txtcompanyname.getText());
        inscov.setAddress(txtaddress.getText());
        inscov.setNumber(txtnumber.getText());
        inscov.setDeductable(txtdeductable.getText());
        inscov.setPremium(txtpremium.getText());
        inscov.setBenefit(txtabenefit.getText());
        
        JOptionPane.showMessageDialog(this,"Insurance Data Saved.");
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblINCTittle;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblbenefit;
    private javax.swing.JLabel lblcompanyname;
    private javax.swing.JLabel lblcropid;
    private javax.swing.JLabel lbldeductable;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblpremium;
    private javax.swing.JTextArea txtabenefit;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcompanyname;
    private javax.swing.JTextField txtcropid;
    private javax.swing.JTextField txtdeductable;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtpremium;
    // End of variables declaration//GEN-END:variables
}
