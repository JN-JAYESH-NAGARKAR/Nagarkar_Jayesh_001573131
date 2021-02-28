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
public class PersonDirectory {
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addNewPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    } 
    
}
