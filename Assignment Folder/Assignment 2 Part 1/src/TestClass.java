
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class TestClass {
    public static void main(String arg[]){
        
        Patient p = new Patient();
//        testPart1HardCoded();
//        testPart1Dynamic(p);
//        testPart1Dynamic(p);
//        testPart1Dynamic(p);
//        p.printPatientHistory();
        
        System.out.println("1. Run HardCoded Testcases:");
        System.out.println("2. Run testcases from keyboard to check Patient.isPatientNormal() method is working or not");
        System.out.println("3 Add new Vital Signs");
        System.out.println("4 Print all Past Patient Vital signs history");
        System.out.println("5 Enter any one sign to check if it is normal");
        System.out.println("6 Exit");
        System.out.println("7. Check if Patient is normal or not");
        Scanner sc = new Scanner(System.in);
        int quitMenu = 0;
        while(true){
            if(quitMenu == 1) break;
             
            System.out.println("Which Option would you like to select?");
            int opt = Integer.valueOf(sc.next());
            switch(opt){
                case 1:
                    testPart1HardCoded();
                    break;
                case 2:
                    testPart1Dynamic(p);
                    break;
                case 3:
                    VitalSigns vs = p.addVitalSigns();
                    if(p.getName() == null){
                        System.out.println("Enter Patient Name :");
                        p.setName(sc.next());
                        System.out.println("Enter Patient Age :");
                        p.setAge(Integer.valueOf(sc.next()));
                    }
                    System.out.println("Please enter Respiratory Rate");
                    vs.setRespiratoryRate(Integer.valueOf(sc.next()));
                    System.out.println("Please enter heart Rate");
                    vs.setHeartRate(Integer.valueOf(sc.next()));
                    System.out.println("Please enter  blood pressure");
                    vs.setBloodPressure(Integer.valueOf(sc.next()));
                    System.out.println("Please enter weight in kilo");
                    vs.setWeightInKilo(Double.valueOf(sc.next()));
                    System.out.println("Please enter weight in pound");
                    vs.setWeightInPound(Double.valueOf(sc.next()));
                    
                    break;
                case 4:
                    p.printPatientHistory();
                    break;
                case 5:
                    System.out.println("Enter Any one current sign to check if it is noraml");
                    if(p.isThisVitalSignNormal(sc.next())){
                        System.out.println("Entered sign is noraml");
                    }
                    else{
                        System.out.println("Entered sign is not normal");
                    }
                    break;
                case 6:
                    quitMenu = 1;
                    break;
                case 7:
                    if(p.isPatientNormal(p.getCurrentVitalSigns())){
                        System.out.println("Patient is normal");
                    }
                    else{
                        System.out.println("Patient is not normal");
                    }
                  
                    
            }     
        }
        
    }
    
    //test isPatientNormal function by test cases entered dynamically  from keyboard
    private static void testPart1Dynamic(Patient p){
        //Patient p = new Patient();
        VitalSigns vs = p.addVitalSigns();
        Scanner sc = new Scanner(System.in);
        if(p.getName() == null ){
            System.out.println("Enter the Name:");
            p.setName(sc.next());
            
            System.out.println("Enter the Age:");
            p.setAge(sc.nextInt());
        }
        
//        System.out.println("Enter the month of DOB:");
//        obj.setMonth(sc.nextInt());
//        System.out.println("Enter the date of DOB:");
//        obj.setDate(sc.nextInt());
        /*LocalDate pdate = LocalDate.of(age_y, age_m, age_d);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pdate, now);
        age_y = diff.getYears();*/
        //System.out.println("AGE is "+ obj.getAge());
        //p.setAge(age_y);
        
        System.out.println("Enter the Respiratory Rate :");
        vs.setRespiratoryRate(sc.nextInt());
        System.out.println("Enterthe Heart Rate :");
        vs.setHeartRate(sc.nextInt());
        System.out.println("Enter the Systolic Blood Pressure :");
        vs.setBloodPressure(sc.nextInt());
        System.out.println("Enter the Weight in Kilos :");
        vs.setWeightInPound(sc.nextDouble());
        System.out.println("Enter the Weight in Pounds :");
        vs.setWeightInKilo(sc.nextDouble());
        System.out.println( "Is patient Normal ? " + p.isPatientNormal(vs));

        
    }
    
    
    
    
    
    
    //Testcases for isPatientNormal method written inside Patient class ,hardcoded test cases
    private static void testPart1HardCoded(){
        
        boolean isPatientNormal;
      
        //for newborn child 
        VitalSigns vs1 = new VitalSigns();
        Patient p1 = new Patient();
        p1.setName("Jayesh Mahendra Nagarkar");
        p1.setAge(0.8);
        vs1.setRespiratoryRate(35);
        vs1.setHeartRate(125);
        vs1.setBloodPressure(19);
        vs1.setWeightInKilo(2);
        vs1.setWeightInPound(4.5);
        isPatientNormal = p1.isPatientNormal(vs1);
        String tmp = isPatientNormal == true ? "Patient is normal" : "Patient is not normal";
        System.out.println(tmp);
        
        
        VitalSigns vs2 = new VitalSigns();
        Patient p2 = new Patient();
        p2.setName("Bush");
        p2.setAge(0.9);
        vs2.setRespiratoryRate(23);
        vs2.setHeartRate(90);
        vs2.setBloodPressure(79);
        vs2.setWeightInKilo(7);
        vs2.setWeightInPound(14);
        isPatientNormal = p2.isPatientNormal(vs2);
        tmp = isPatientNormal == true ? "Patient is normal" : "Patient is not normal";
        System.out.println(tmp);
        
        
        VitalSigns vs3 = new VitalSigns();
        Patient p3 = new Patient();
        p3.setName("George");
        p3.setAge(2);
        vs3.setRespiratoryRate(29);
        vs3.setHeartRate(90);
        vs3.setBloodPressure(99);
        vs3.setWeightInKilo(12);
        vs3.setWeightInPound(24);
        isPatientNormal = p3.isPatientNormal(vs3);
        tmp = isPatientNormal == true ? "Patient is normal" : "Patient is not normal";
        System.out.println(tmp);
        
        //for preschool
        VitalSigns vs4 = new VitalSigns();
        Patient p4 = new Patient();
        p4.setName("Angelina");
        p4.setAge(4);
        vs4.setRespiratoryRate(23);
        vs4.setHeartRate(131);
        vs4.setBloodPressure(88);
        vs4.setWeightInKilo(17);
        vs4.setWeightInPound(34);
        isPatientNormal = p4.isPatientNormal(vs4);
        tmp = isPatientNormal == true ? "Patient is normal" : "Patient is not normal";
        System.out.println(tmp);
        
        //for school age
        VitalSigns vs5 = new VitalSigns();
        Patient p5 = new Patient();
        p5.setName("Obama");
        p5.setAge(8);
        vs5.setRespiratoryRate(29);
        vs5.setHeartRate(89);
        vs5.setBloodPressure(120);
        vs5.setWeightInKilo(29);
        vs5.setWeightInPound(58);
        isPatientNormal = p5.isPatientNormal(vs5);
        tmp = isPatientNormal == true ? "Patient is normal" : "Patient is not normal";
        System.out.println(tmp);
        
        
        //for adult
        VitalSigns vs6 = new VitalSigns();
        Patient p6 = new Patient();
        p6.setName("Krishna");
        p6.setAge(14);
        vs6.setRespiratoryRate(18);
        vs6.setHeartRate(99);
        vs6.setBloodPressure(111);
        vs6.setWeightInKilo(60);
        vs6.setWeightInPound(120);
        isPatientNormal = p6.isPatientNormal(vs6);
        tmp = isPatientNormal == true ? "Patient is normal" : "Patient is not normal";
        System.out.println(tmp);
        
        
        
    }
}
