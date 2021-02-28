/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author acer
 */
public class Patient {
    
    String name;
    int age;
    
    EncounterHistory encounterHistory;
    
    public Patient(){
        encounterHistory = new EncounterHistory();
    }

    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

   
    public boolean isPatientNormal(){
        boolean isPatientNormal = true;
         int bloodPressure = encounterHistory.getEncounterList().get(encounterHistory.getEncounterList().size()-1).getVitalSigns().getBloodPressure();
         if(this.getAge()<0.083){
            
            if( bloodPressure >= 50 && bloodPressure <= 70 ){
               
            }else{
                isPatientNormal= false;
            }
            
        }else if(this.getAge()<1){
                     
            if( bloodPressure >=70 && bloodPressure<=100 ){
                
            }else{
                isPatientNormal = false;
            }
           
        }else if(this.getAge()<3){
                        
            if( bloodPressure >=80 && bloodPressure <=110 ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(this.getAge()<5){
                        
            if( bloodPressure >=80 && bloodPressure <=110 ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(this.getAge()<12){
                      
            if(bloodPressure >=80 && bloodPressure <=120 ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(this.getAge()>=12){
                       
            if( bloodPressure >=110 && bloodPressure <=120 ){
                
            }else{
               
                
                isPatientNormal = false;
            }
        
        }
         
         return isPatientNormal;
    }
}
