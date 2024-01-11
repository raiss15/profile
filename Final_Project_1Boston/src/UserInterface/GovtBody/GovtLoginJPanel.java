/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.GovtBody;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sanatpopli
 */
public class GovtLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GovtLoginJPanel
     */
    

    /**
     * Creates new form GovtLoginJPanel
     */
    JPanel workArea;
    Business business;
    public GovtLoginJPanel(JPanel workArea, Business business) {
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

        RoleLabel = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        userNamejLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        passwordjLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        LoginjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));

        RoleLabel.setText("Role");

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mayor", "Police", "Ambulance", "FireBrigade" }));

        userNamejLabel.setText("UserName");

        jTextField1.setText("jTextField1");

        passwordjLabel.setText("Password");

        jPasswordField1.setText("jPasswordField1");

        LoginjButton.setBackground(new java.awt.Color(255, 204, 204));
        LoginjButton.setText("Login");
        LoginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordjLabel)
                    .addComponent(userNamejLabel)
                    .addComponent(RoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roleComboBox, 0, 273, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(LoginjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoleLabel))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNamejLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordjLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(LoginjButton)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginjButtonActionPerformed
        // TODO add your handling code here:
        String selectedrole=(String) roleComboBox.getSelectedItem();
        if(selectedrole.equals("Police")){
         PoliceJPanel panel = new PoliceJPanel(workArea, business);
         workArea.add("PoliceJPanel", panel);
         CardLayout layout = (CardLayout) workArea.getLayout();
         layout.next(workArea);
        }
        else if(selectedrole.equals("Ambulance")){
            AmbulanceJPanel panel = new AmbulanceJPanel(workArea, business);
         workArea.add("AmbulanceJPanel", panel);
         CardLayout layout = (CardLayout) workArea.getLayout();
         layout.next(workArea);
        }
        else if(selectedrole.equals("FireBrigade")){
         FireFighterWorkAreaJPanel panel = new FireFighterWorkAreaJPanel(workArea, business);
         workArea.add("FireBrigadeJPanel", panel);
         CardLayout layout = (CardLayout) workArea.getLayout();
         layout.next(workArea);  
        }
        else{
            MayorJPanel panel = new MayorJPanel(workArea, business);
         workArea.add("MayorJPanel", panel);
         CardLayout layout = (CardLayout) workArea.getLayout();
         layout.next(workArea);  
        }
    }//GEN-LAST:event_LoginjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginjButton;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JLabel userNamejLabel;
    // End of variables declaration//GEN-END:variables
}
