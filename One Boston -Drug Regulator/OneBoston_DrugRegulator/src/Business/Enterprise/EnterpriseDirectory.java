/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author bhagyatrivedi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if (type==Enterprise.EnterpriseType.Pharmacy){
            enterprise= new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type==Enterprise.EnterpriseType.Drug){
            enterprise=new DrugEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.Chemical){
                
            enterprise=new ChemicalEnterprise(name);
            enterpriseList.add(enterprise);
           
        }
        return enterprise;
    }
}
