/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.LabWorkArea.LabWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bhagyatrivedi
 */
public class LabRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new LabWorkAreaJPanel(userProcessContainer,account,(LabOrganization)organization,enterprise,business,network);
    }
    
}
