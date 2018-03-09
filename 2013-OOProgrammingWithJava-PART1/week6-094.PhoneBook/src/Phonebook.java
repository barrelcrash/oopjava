/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class Phonebook {
    private ArrayList<Person> entries;
    
    public Phonebook() {
        this.entries = new ArrayList();
    }
    
    public void add(String name, String number) {
        this.entries.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person person : entries) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        String result = "number not known";
        
        for (Person person : entries) {
            if (person.getName() == name) {
                result = person.getNumber();
            }
        }
        
        return result;
    }
}
