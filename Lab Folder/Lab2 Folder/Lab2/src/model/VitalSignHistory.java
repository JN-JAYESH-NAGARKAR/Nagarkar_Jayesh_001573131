/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> history;

    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns addNewVital(){
        VitalSigns newVital = new VitalSigns();
        this.history.add(newVital);
        return newVital;
    }
            
}
