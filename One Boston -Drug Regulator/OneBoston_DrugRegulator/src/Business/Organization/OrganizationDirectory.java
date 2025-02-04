/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization=new LabOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization=new PharmaOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Drug.getValue())){
            organization=new DrugOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Chemical.getValue())){
            organization=new ChemicalOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}