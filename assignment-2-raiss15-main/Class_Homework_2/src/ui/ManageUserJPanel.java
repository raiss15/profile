/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.UserList;


/**
 *
 * @author Admin
 */
public class ManageUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserJPanel
     */
  private JPanel userProcessContainer;
    private UserList userlist;
    ManageUserJPanel(JPanel userProcessContainer, UserList userlist) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
     this.userlist=userlist;
     populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel dtm= (DefaultTableModel) tblAdmin.getModel();
        dtm.setRowCount(0);
        for(Admin admin:userlist.getHistory()){
            Object[] row=new Object[4];
            row[0]=admin;
            row[1]=admin.getNEUID();
            row[2]=admin.getUSERID();
            row[3]=admin.getUsername();
            //row[4]=admin.getPassword();
            
            dtm.addRow(row);
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

        lblmngacc = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btndelet = new javax.swing.JButton();
        btndisable = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();

        lblmngacc.setText("Manage Account");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btndelet.setText("Delete");
        btndelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletActionPerformed(evt);
            }
        });

        btndisable.setText("Disable");
        btndisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndisableActionPerformed(evt);
            }
        });

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnback.setText("Back");

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NEU ID", "User ID", "User Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAdmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblAdmin);
        if (tblAdmin.getColumnModel().getColumnCount() > 0) {
            tblAdmin.getColumnModel().getColumn(0).setResizable(false);
            tblAdmin.getColumnModel().getColumn(1).setResizable(false);
            tblAdmin.getColumnModel().getColumn(2).setResizable(false);
            tblAdmin.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lblmngacc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btndelet)
                                .addGap(54, 54, 54)
                                .addComponent(btndisable)
                                .addGap(464, 464, 464)
                                .addComponent(btnview))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsearch)
                                .addGap(18, 18, 18)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(316, 316, 316)
                                .addComponent(btnback))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmngacc)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearch)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelet)
                    .addComponent(btndisable)
                    .addComponent(btnview))
                .addGap(174, 174, 174))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        int selectedrow=tblAdmin.getSelectedRow();
         if(selectedrow<0){
             JOptionPane.showMessageDialog(this, "Please select the row");
         }
         else{
             Admin admin=(Admin) tblAdmin.getValueAt(selectedrow, 0);
             ViewUserJPanel viewpanel=new ViewUserJPanel(userProcessContainer, userlist,admin);
             userProcessContainer.add("ViewUserJPanel",viewpanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    } 
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        
         String result=userlist.searchUser(txtsearch.getText());
        if(result==null){
            JOptionPane.showMessageDialog(this, "Invalid NEUID");
            
        }
        else{
            ViewUserJPanel viewuserpanel=new ViewUserJPanel(userProcessContainer,result);
             userProcessContainer.add("ViewUserJPanel",viewuserpanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btndeletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletActionPerformed
        // TODO add your handling code here:
        
        int selectedrow=tblAdmin.getSelectedRow();
        if(selectedrow>=0){
            int dialogueButton= JOptionPane.YES_NO_OPTION;
            int dialogueResult= JOptionPane.showConfirmDialog(null, "would you like to delete", "Warning", dialogueButton);
            if(dialogueResult==JOptionPane.YES_OPTION){
                Admin admin=(Admin) tblAdmin.getValueAt(selectedrow,0);
                userlist.deleteUser(admin);
                populateTable();
            }
            
        }
        else{ 
            JOptionPane.showMessageDialog(this, "Please select the row");
        }
    }//GEN-LAST:event_btndeletActionPerformed

    private void btndisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndisableActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btndisableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelet;
    private javax.swing.JButton btndisable;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnview;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblmngacc;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
