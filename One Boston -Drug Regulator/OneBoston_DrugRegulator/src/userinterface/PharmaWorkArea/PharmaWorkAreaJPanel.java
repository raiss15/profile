/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmaWorkArea;

import Business.Enterprise.Enterprise;
import Business.MedicalInventory.MedicalInventory;
import Business.MedicalInventory.MedicalInventoryList;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PharmaOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugWorkRequest;
import Business.WorkQueue.PharmaWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanatpopli
 */
public class PharmaWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaWorkAreaJPanel
     */
    JPanel workArea;
    private UserAccount uA;
    private Enterprise ep;
    private MedicalInventoryList minv;
    private Organization org;
    private PharmaOrganization pog;
    private Network nw;
    private static final String CLASS_NAME = PharmaWorkAreaJPanel.class.getName();

    public PharmaWorkAreaJPanel(JPanel workArea, UserAccount uA, PharmaOrganization pog, Enterprise ep, Network nw) {
        initComponents();
        this.workArea = workArea;
        this.uA = uA;
        this.ep = ep;
        this.pog = pog;
        this.nw = nw;
        tblReorder();
        tblPopulateDoc();
    }

    public void tblReorder() {
        int count = tblRecord.getRowCount();
        DefaultTableModel mod = (DefaultTableModel) tblRecord.getModel();
        for (int p = count - 1; p >= 0; p--) {
            mod.removeRow(p);
        }
        for (MedicalInventory mi : pog.getMedList()) {
            Object row[] = new Object[6];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
            //row[5] = mi.getReorderStatus();
            mod.addRow(row);
        }
    }

    public void tblPopulateDoc() {
        DefaultTableModel mod = (DefaultTableModel) tblDocRequest.getModel();

        mod.setRowCount(0);

        for (WorkRequest req : pog.getWorkQueue().getWorkRequestList()) {
            System.out.println("entering medication");
           
             if(req instanceof PharmaWorkRequest){
            Object[] row = new Object[3];
            row[0] = ((PharmaWorkRequest) req).getMedicationName();
            row[1] = ((PharmaWorkRequest) req).getQuantity();
            row[2] = ((PharmaWorkRequest) req).getStatus();

            mod.addRow(row);
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

        jScrollPane = new javax.swing.JScrollPane();
        tblDocRequest = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecord = new javax.swing.JTable();
        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblMedicineName = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        lblAvailQuantity = new javax.swing.JLabel();
        txtAvailQuantity = new javax.swing.JTextField();
        lblRequiredQuantity = new javax.swing.JLabel();
        txtReqQuantity = new javax.swing.JTextField();
        viewRequestsBtn = new javax.swing.JButton();
        btnAddMedicine = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnStatusCheck = new javax.swing.JButton();
        lblPharmacy = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDocRequest.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblDocRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "QUANTITY", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDocRequest.setRowHeight(25);
        jScrollPane.setViewportView(tblDocRequest);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 686, 714, 177));

        tblRecord.setBackground(new java.awt.Color(255, 255, 153));
        tblRecord.setBorder(new javax.swing.border.MatteBorder(null));
        tblRecord.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecord.setRowHeight(25);
        jScrollPane1.setViewportView(tblRecord);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 111, 1270, 238));

        lblSerialNumber.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblSerialNumber.setText("SERIAL NUMBER: ");
        add(lblSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 382, 241, 23));

        txtSerialNumber.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(txtSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 382, 252, 30));

        lblMedicineName.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblMedicineName.setText("MEDICINE NAME: ");
        add(lblMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 229, 25));

        txtMedicineName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(txtMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 423, 252, 30));

        lblAvailQuantity.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblAvailQuantity.setForeground(new java.awt.Color(255, 0, 0));
        lblAvailQuantity.setText("AVAILABLE Dosage:");
        add(lblAvailQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 467, 282, -1));

        txtAvailQuantity.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        add(txtAvailQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 252, 30));

        lblRequiredQuantity.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblRequiredQuantity.setForeground(new java.awt.Color(255, 0, 0));
        lblRequiredQuantity.setText("REQUIRED Dosages:");
        add(lblRequiredQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 506, 293, -1));

        txtReqQuantity.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        txtReqQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReqQuantityActionPerformed(evt);
            }
        });
        add(txtReqQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 252, 30));

        viewRequestsBtn.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        viewRequestsBtn.setText("VIEW REQUESTS");
        viewRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsBtnActionPerformed(evt);
            }
        });
        add(viewRequestsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(981, 520, 420, -1));

        btnAddMedicine.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnAddMedicine.setText("ADD MEDICINE");
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });
        add(btnAddMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 251, -1));

        btnViewDetails.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnViewDetails.setText("VIEW DETAILS");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, 420, -1));

        btnStatusCheck.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnStatusCheck.setText("Check Storage");
        btnStatusCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusCheckActionPerformed(evt);
            }
        });
        add(btnStatusCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 420, -1));

        lblPharmacy.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lblPharmacy.setText("Pharma Work Area");
        add(lblPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtReqQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReqQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqQuantityActionPerformed

    private void viewRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("DisplayRequestsJPanel", new DisplayRequestsJPanel(workArea, uA, ep, org));
        layout.next(workArea);


    }//GEN-LAST:event_viewRequestsBtnActionPerformed

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        // TODO add your handling code here:

        MedicalInventory m = new MedicalInventory();
        String names = txtMedicineName.getText().trim();
        String error_message = "";
        String available = txtAvailQuantity.getText();
        try {
            Integer.parseInt(available);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;

        }
        if(names.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the name ");
            return;
        }
        
        m.setMedicineName(txtMedicineName.getText());
        try{
        int availQuant = Integer.parseInt(txtAvailQuantity.getText());
        m.setAvailQuantity(availQuant);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer only");
            return;
        }
        try{
        int sNo = Integer.parseInt(txtSerialNumber.getText());
        m.setSerialNumber(sNo);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer only");
            return;
        }
        String req = txtReqQuantity.getText();
        try {
           
            m.setRequiredQuantity( Integer.parseInt(req));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Required quantity must be integer only");
            return;
        }
       
//        ArrayList<String> medicineCheck = new ArrayList<>();
//        for(MedicalInventory mc:pog.getMedList())
//        {
//            medicineCheck.add(mc.getMedicineName().toLowerCase());
//        }
//        if(medicineCheck.contains(names.toLowerCase()))
//        {
//            JOptionPane.showMessageDialog(null, "medicine already existed please update the quantity by clicking on view details");
//            return;
//        }
        pog.addMedicine(m);
        m.setReorderStatus("N");

        DefaultTableModel mod = (DefaultTableModel) tblRecord.getModel();

        mod.setRowCount(0);
        for (MedicalInventory mi : pog.getMedList()) {
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
            mod.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Medicine Added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        txtSerialNumber.setText("");
        txtMedicineName.setText("");
        txtAvailQuantity.setText("");
        txtReqQuantity.setText("");

    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int rowx = tblRecord.getSelectedRow();
        if (rowx < 0) {
            JOptionPane.showMessageDialog(null, "Pls select row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        MedicalInventory mi = (MedicalInventory) tblRecord.getValueAt(rowx, 0);

        CardLayout layout = (CardLayout) workArea.getLayout();
        workArea.add("DisplayDetailsJPanel", new DisplayDetailsJPanel(workArea, uA, ep, mi));
        layout.next(workArea);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnStatusCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusCheckActionPerformed
        // TODO add your handling code here:
        int medicinecheck=0; 
        for (MedicalInventory mi : pog.getMedList()) {
            medicinecheck++;
         }
         
         if(medicinecheck<=0)
        {
            JOptionPane.showMessageDialog(null,"No drug is present in invetory check  ");
            return;
        }
        for (MedicalInventory mi : pog.getMedList()) {

            if (mi.getAvailQuantity() <= mi.getRequiredQuantity()) {
                if (!mi.getReorderStatus().equals("Y")) {
                    DrugWorkRequest request = new DrugWorkRequest();
                    
                    mi.setReorderStatus("Y");
                    request.setDrugName(mi.getMedicineName());
                    request.setQuantity(mi.getRequiredQuantity());
                    request.setSender(uA);

                    uA.getWorkQueue().getWorkRequestList().add(request);
                    for (Enterprise enterprise : nw.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println("***** Organization Name:" + enterprise.getName());
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            System.out.println("***** Organization Name:" + organization.getName());
                            if (organization.getName().equals("Drug Organization")) {
                                System.out.println("True");

                                System.out.println("***** organization Name" + organization.getName());

                                organization.getWorkQueue().getWorkRequestList().add(request);
                            }
                        }

                    }

                }

            }
        }
        JOptionPane.showMessageDialog(null, "Inventory stat checked and updated successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        tblReorder();
    }//GEN-LAST:event_btnStatusCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnStatusCheck;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailQuantity;
    private javax.swing.JLabel lblMedicineName;
    private javax.swing.JLabel lblPharmacy;
    private javax.swing.JLabel lblRequiredQuantity;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTable tblDocRequest;
    private javax.swing.JTable tblRecord;
    private javax.swing.JTextField txtAvailQuantity;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtReqQuantity;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JButton viewRequestsBtn;
    // End of variables declaration//GEN-END:variables
}
