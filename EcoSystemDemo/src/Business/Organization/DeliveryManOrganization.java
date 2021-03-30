/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManRole;
import Business.Role.Role;           //update here  ---jayesh
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class DeliveryManOrganization extends Organization{
    
    public DeliveryManOrganization() {
        super(Organization.Type.DeliveryMan.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManRole());              //update here     --jayesh
        return roles;
    }
    
}
