/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MainClass {
     public static void main(String[] arg){
        System system = new System();
        //instializeAllClass(system);
        
        countNotNormalBP(system);
        
        Scanner sc = new Scanner(java.lang.System.in);
        java.lang.System.out.println("how many community you want to add: ");
        int numberOfCommunity = Integer.valueOf(sc.next());
        
        
        for(int i = 0 ; i<numberOfCommunity;i++){
            java.lang.System.out.println("add name of community " + i);
            dynamicInitializeCommunity(system , sc.next());
        }
        
        countNotNormalBP(system);

    }
    
    public static void dynamicInitializeCommunity(System system , String communityName){
        Scanner sc = new Scanner(java.lang.System.in);
        
        City city = system.getCity();
        Community c = city.addCommunity();   //commmunity instance
        c.setCommunityName(communityName);
        
        
        java.lang.System.out.println("Howmany persons you want to add in " + c.getCommunityName());
        int numberOfPersons = Integer.valueOf(sc.next());
        
        for(int i = 0 ; i< numberOfPersons ; i++){
            java.lang.System.out.println("add name of Person " + i);
            String  name = sc.next();
            
            java.lang.System.out.println("add Age of Person " + i);
            int age = Integer.valueOf(sc.next());
            
            
            java.lang.System.out.println("add blood pressure of patient " + i);
            int bp = Integer.valueOf(sc.next());
            
            dynamicInitializePersons(system , name , c ,age ,bp );
        }
    
    }
    
    public static void dynamicInitializePersons(System system , String personName , Community c , int age, int bp){
        Home home = c.addHome();
        
        PersonDirectory personDirectory = system.getPersonDirectory();
        
        Person person = personDirectory.addNewPerson(); // person1 instance
        home.setPerson(person);
        
        
        PatientDirectory patientDirectory = system.getPatientDirectory(); //patient1 instance
        Patient patient = patientDirectory.addNewPatient();
        patient.setName(personName);
        patient.setAge(age);
        person.setPatient(patient);
        
        
        
        EncounterHistory eh = patient.getEncounterHistory();
        Encounter e = eh.addNewEncounter();
        VitalSigns vs = new VitalSigns();    //vitalsigns1 instance
        vs.setBloodPressure(bp);
        e.setVitalSigns(vs);
        
    }
    
    
     
    
    
    
    
    
    
    public static void instializeAllClass(System system){
        
        City city = system.getCity();
        Community c1 = city.addCommunity();   //commmunity instance
        c1.setCommunityName("Roxbury");
        Community c2 = city.addCommunity();
        c2.setCommunityName("Jamaica Plain");
        Home h1 = c1.addHome();
        Home h2 = c2.addHome();
        
        PersonDirectory personDirectory = system.getPersonDirectory();
        
        Person person1 = personDirectory.addNewPerson(); // person1 instance
        h1.setPerson(person1);
        
        
        
        PatientDirectory patientDirectory = system.getPatientDirectory(); //patient1 instance
        Patient patient1 = patientDirectory.addNewPatient();
        patient1.setName("Mr Bean");
        patient1.setAge(12);
        person1.setPatient(patient1);
        //patient1.setPerson(person1);
        
        
        Person person2 = personDirectory.addNewPerson();  //person2 instance
        h2.setPerson(person2);
        
        
        
        Patient patient2 = patientDirectory.addNewPatient();    //patient2 instance
        person2.setPatient(patient2); 
        patient2.setName("Tyson");
        patient2.setAge(1);
        //patient2.setPerson(person2);
        
        
        
        Person person3 = personDirectory.addNewPerson();    //person3 instance
        h2.setPerson(person3);
        
        
        
        Patient patient3 = patientDirectory.addNewPatient();   //patient3 instance
        person3.setPatient(patient3);
        patient3.setName("Dracula");
        patient3.setAge(2);
        //patient3.setPerson(person3);
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        Home h3 = c2.addHome();
        Person person4 = personDirectory.addNewPerson();
        h3.setPerson(person4);//person3 instance
        
        
        
        
        Patient patient4 = patientDirectory.addNewPatient();   //patient4 instance
        person4.setPatient(patient4);
        patient4.setName("jayesh");
        patient4.setAge(2);
        
        EncounterHistory eh4 = patient4.getEncounterHistory();
        Encounter e4 = eh4.addNewEncounter();
        VitalSigns vs4 = new VitalSigns();    //vitalsigns1 instance
        vs4.setBloodPressure(0);
        e4.setVitalSigns(vs4);
        
        
        /////////////////////////////////////////////////////////////////////////////////////////////////
        
        EncounterHistory eh1 = patient1.getEncounterHistory();  //encounter history instance
        EncounterHistory eh2 = patient2.getEncounterHistory();
        EncounterHistory eh3 = patient3.getEncounterHistory();
        
        Encounter e11 = eh1.addNewEncounter();        //encounter instance
        
        Encounter e12 = eh2.addNewEncounter();
        
        Encounter e13 = eh3.addNewEncounter();
        
        VitalSigns vs1 = new VitalSigns();    //vitalsigns1 instance
        vs1.setBloodPressure(0);
        e11.setVitalSigns(vs1);
        
        VitalSigns vs2 = new VitalSigns();      //vitalsigns2 instance
        vs2.setBloodPressure(1);
        e12.setVitalSigns(vs2);
        
        VitalSigns vs3 = new VitalSigns();          //vitalsigns3 instance
        vs3.setBloodPressure(1);
        e13.setVitalSigns(vs3);

    }
   
    public static void countNotNormalBP(System system){
        for(Community community : system.getCity().getCommunityList()){
            int i = 0;
            java.lang.System.out.println("----------------" + community.getCommunityName() + "-----------------------");
            for(Home home:community.getHomeList()){
                
                Patient p = home.getPerson().getPatient();
                
                
                if(!p.isPatientNormal()){
                    i++;
                    java.lang.System.out.println("Patient Name " + p.getName());
                    java.lang.System.out.println("Patient Name " + p.getAge());
                    for(Encounter e : p.getEncounterHistory().getEncounterList()){
                        java.lang.System.out.println("Patient blood Pressure " + e.getVitalSigns().getBloodPressure());
                    }
                    for(Community c : system.getCity().getCommunityList()){
                        for(Home h : c.getHomeList()){
                            java.lang.System.out.println("Person Home Number :  " + h.getHomeNumber());
                            java.lang.System.out.println("Person Home Number :  " + h.getStreetName());
                            break;
                        }
                        break;
                    }
                }
            }
            java.lang.System.out.println("Total Number of  abnormal cases in "+community.getCommunityName()+"  is : " + i );
        }
    }

}
