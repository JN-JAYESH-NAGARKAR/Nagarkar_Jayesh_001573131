
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Patient {
    
    private String name;
    private double age;
    private VitalSigns currentVitalSigns;
    private ArrayList<VitalSigns> patientVitalSignsHistory;

    
    public Patient(){
        this.patientVitalSignsHistory = new ArrayList<VitalSigns>();
    }
    
    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return patientVitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.patientVitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVitalSigns(){
        if(this.currentVitalSigns != null){
            this.patientVitalSignsHistory.add(this.currentVitalSigns);
        }
        this.currentVitalSigns = new VitalSigns();
        return this.currentVitalSigns;
    }
    
    public VitalSigns getCurrentVitalSigns() {
        return currentVitalSigns;
    }

    public void setCurrentVitalSigns(VitalSigns currentVitalSigns) {
        this.currentVitalSigns = currentVitalSigns;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    
    public boolean isPatientNormal(VitalSigns vs){
        boolean isPatientNormal = true;
         if(this.getAge()<0.083){
            
            if( (vs.getRespiratoryRate() >= 30 && vs.getRespiratoryRate() <=50)&& (vs.getHeartRate() >= 120 && vs.getHeartRate() <= 160)&& (vs.getBloodPressure() >= 50 && vs.getBloodPressure() <= 70)&& (vs.getWeightInKilo() >=2 && vs.getWeightInKilo()<=3)&&(vs.getWeightInPound()>=4.5 && vs.getWeightInPound()<=7) ){
               
            }else{
                isPatientNormal= false;
            }
            
        }else if(this.getAge()<1){
                     
            if( (vs.getRespiratoryRate()>=20 &&vs.getRespiratoryRate()<=30)&& (vs.getHeartRate()>=80&&vs.getHeartRate()<=140)&& (vs.getBloodPressure()>=70 && vs.getBloodPressure()<=100)&& (vs.getWeightInKilo()>=4 && vs.getWeightInKilo()<=10)&&(vs.getWeightInPound()>=9 && vs.getWeightInPound()<=22) ){
                
            }else{
                isPatientNormal = false;
            }
           
        }else if(this.getAge()<3){
                        
            if( (vs.getRespiratoryRate()>=20 &&vs.getRespiratoryRate()<=30)&& (vs.getHeartRate()>=80&&vs.getHeartRate()<=130)&& (vs.getBloodPressure()>=80 && vs.getBloodPressure()<=110)&& (vs.getWeightInKilo()>=10 && vs.getWeightInKilo()<=14)&&(vs.getWeightInPound()>=22 && vs.getWeightInPound()<=31) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(this.getAge()<5){
                        
            if( (vs.getRespiratoryRate()>=20 &&vs.getRespiratoryRate()<=30)&& (vs.getHeartRate()>=80 && vs.getHeartRate()<=120)&& (vs.getBloodPressure() >=80 && vs.getBloodPressure() <=110)&& (vs.getWeightInKilo()>=14 && vs.getWeightInKilo()<=18)&&(vs.getWeightInPound()>=31 && vs.getWeightInPound()<=40) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(this.getAge()<12){
                      
            if( (vs.getRespiratoryRate()>=20 &&vs.getRespiratoryRate()<=30)&& (vs.getHeartRate()>=70 && vs.getHeartRate()<=110)&& (vs.getBloodPressure()>=80 && vs.getBloodPressure()<=120)&& (vs.getWeightInKilo()>=20 && vs.getWeightInKilo()<=42)&&(vs.getWeightInPound()>=41 && vs.getWeightInPound()<=92) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }else if(this.getAge()>=12){
                        
            if( (vs.getRespiratoryRate()>=12 &&vs.getRespiratoryRate()<=20)&& (vs.getHeartRate()>=55 && vs.getHeartRate()<=105)&& (vs.getBloodPressure()>=110 && vs.getBloodPressure()<=120)&& (vs.getWeightInKilo()>50) && (vs.getWeightInPound()>110) ){
                
            }else{
                isPatientNormal = false;
            }
        
        }
         
         return isPatientNormal;
    }
    
    public void printPatientHistory(){
        int i = 0;
        if(this.patientVitalSignsHistory.isEmpty()) System.out.println("No Past Patient history to print");
        System.out.println("Patient Name : " + this.name);
        System.out.println("Patient Age : " + this.age);
        for(VitalSigns vs : this.patientVitalSignsHistory){
            i++;
            System.out.println("----------------------------------------------------------");
            System.out.println("Past Vital Signs " + i);
            System.out.println("Respiratory Rate : " + vs.getRespiratoryRate());
            System.out.println("Heart Rate : " + vs.getHeartRate());
            System.out.println("Systolic Blood Pressure : " + vs.getBloodPressure());
            System.out.println("Weight in Kilos : " + vs.getWeightInKilo());
            System.out.println("Weight in Pounds : " + vs.getWeightInPound() );
        }
        
    }
   
    public boolean isThisVitalSignNormal(String vsign){
        boolean isNormal = true;
        if(this.getAge()< 0.083 ){
                
                if(vsign.contains("Respiratory")){
                    if(this.getCurrentVitalSigns().getRespiratoryRate()>=30 && this.getCurrentVitalSigns().getRespiratoryRate()<=50){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Heart")){
                    if(this.getCurrentVitalSigns().getHeartRate() >=120 && this.getCurrentVitalSigns().getHeartRate()<=160){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Blood Pressure")){
                    if( this.getCurrentVitalSigns().getBloodPressure() >=50 && this.getCurrentVitalSigns().getBloodPressure() <= 70){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Kilo")){
                    if(this.getCurrentVitalSigns().getWeightInKilo() >= 2 && this.getCurrentVitalSigns().getWeightInKilo()<=3){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Pound")){
                    if(this.getCurrentVitalSigns().getWeightInPound() >= 4.5 && this.getCurrentVitalSigns().getWeightInPound() <= 7){
                    }else{
                        isNormal=false;
                    }
                }
           
            
        }else if(this.getAge()<1){
            
            if(vsign.contains("Respiratory")){
                    if(this.currentVitalSigns.getRespiratoryRate() >= 20 && this.currentVitalSigns.getRespiratoryRate() <= 30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Heart")){
                    if( this.getCurrentVitalSigns().getHeartRate() >= 180 && this.getCurrentVitalSigns().getHeartRate() <= 140){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Blood Pressur")){
                    if(this.getCurrentVitalSigns().getBloodPressure() >= 70 && this.getCurrentVitalSigns().getBloodPressure() <=100){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Kilo")){
                    if(this.getCurrentVitalSigns().getWeightInKilo() >= 4 && this.getCurrentVitalSigns().getWeightInKilo()<= 10){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Pound")){
                    if(this.getCurrentVitalSigns().getWeightInPound() >= 9 && this.getCurrentVitalSigns().getWeightInPound() <= 22){
                    }else{
                        isNormal=false;
                    }
                }
                  
           
        }else if(this.getAge()<3){
                        
            if(vsign.contains("Respiratory")){
                    if(this.currentVitalSigns.getRespiratoryRate() >= 20 && this.currentVitalSigns.getRespiratoryRate() <=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Heart")){
                    if(this.getCurrentVitalSigns().getHeartRate() >= 80 && this.getCurrentVitalSigns().getHeartRate() <=130){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Blood Pressure")){
                    if(this.getCurrentVitalSigns().getBloodPressure() >=80 && this.getCurrentVitalSigns().getBloodPressure() <=110){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Kilo")){
                    if(this.getCurrentVitalSigns().getWeightInKilo() >=10 && this.getCurrentVitalSigns().getWeightInKilo() <=14){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Pound")){
                    if(this.getCurrentVitalSigns().getWeightInPound() >= 22 && this.getCurrentVitalSigns().getWeightInPound() <= 31){
                    }else{
                        isNormal=false;
                    }
                }
        
        }else if(this.getAge()<5){
                        
            if(vsign.contains("Respiratory")){
                    if(this.currentVitalSigns.getRespiratoryRate() >= 20 && this.currentVitalSigns.getRespiratoryRate() <=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Heart")){
                    if(this.getCurrentVitalSigns().getHeartRate() >= 80 && this.getCurrentVitalSigns().getHeartRate() <=120){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Blood Pressure")){
                    if(this.getCurrentVitalSigns().getBloodPressure() >=80 && this.getCurrentVitalSigns().getBloodPressure()<=110){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Kilo")){
                    if(this.getCurrentVitalSigns().getWeightInKilo() >=14 && this.getCurrentVitalSigns().getWeightInKilo() <=18){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Pound")){
                    if(this.getCurrentVitalSigns().getWeightInPound() >= 31 && this.getCurrentVitalSigns().getWeightInPound() <= 40){
                    }else{
                        isNormal=false;
                    }
                }
        
        }else if(this.getAge()<12){
                        
            if(vsign.contains("Respiratory")){
                    if(this.currentVitalSigns.getRespiratoryRate() >= 20 && this.currentVitalSigns.getRespiratoryRate() <=30){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Heart")){
                    if(this.getCurrentVitalSigns().getHeartRate() >=70 && this.getCurrentVitalSigns().getHeartRate() <=110){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Blood Pressure")){
                    if(this.getCurrentVitalSigns().getBloodPressure() >=80 && this.getCurrentVitalSigns().getBloodPressure() <=120){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Kilo")){
                    if(this.getCurrentVitalSigns().getWeightInKilo() >= 20 && this.getCurrentVitalSigns().getWeightInKilo() <= 42){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains(" W in Pound")){
                    if(this.getCurrentVitalSigns().getWeightInPound() >= 41 && this.getCurrentVitalSigns().getWeightInPound() <= 92){
                    }else{
                        isNormal=false;
                    }
                }
        
        }else if(this.getAge()>=12){
                        
             if(vsign.contains("Respiratory")){
                    if(this.currentVitalSigns.getRespiratoryRate() >= 12 && this.currentVitalSigns.getRespiratoryRate() <= 20){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Heart")){
                    if(this.getCurrentVitalSigns().getHeartRate() >= 55 && this.getCurrentVitalSigns().getHeartRate() <=105){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("Blood Pressure ")){
                    if(this.getCurrentVitalSigns().getBloodPressure() >=110 && this.getCurrentVitalSigns().getBloodPressure() <=120){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Kilo")){
                    if(this.getCurrentVitalSigns().getWeightInKilo()>50){
                    }else{
                        isNormal=false;
                    }
                }else if(vsign.contains("W in Pound")){
                    if(this.getCurrentVitalSigns().getWeightInPound() > 110){
                    }else{
                        isNormal=false;
                    }
                }
        
        }
            return isNormal;
        
        
        
    }
    
    
    
    
}
