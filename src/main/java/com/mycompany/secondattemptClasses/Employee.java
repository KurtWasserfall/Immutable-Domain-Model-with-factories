/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattemptClasses;

import java.util.List;
/**
 *
 * @author kurt wasserfall 211150142  3B
 */
public final class Employee{
    //extended person
    private final String name;
    private final String Surname;
    private final String Address;
    private final String Phone;
    private final String IdentificationNo;
    
    private final List<Person> persons;
 
    
    private Employee(Builder builder){
        name = builder.name;
        Surname = builder.Surname;
        Address=builder.Address;
        Phone=builder.Phone;
        IdentificationNo=builder.IdentificationNo;
        
        persons=builder.persons;
    }
   
    public static class Builder
    {
    private String name;
    private String Surname;
    private String Address;
    private String Phone;
    private String IdentificationNo;
    
    private List<Person> persons;
    
    
    public Builder(String name){
    
        this.name = name;
    } 
    
    public Builder Surname(String value){
            Surname=value;
            return this;
        }
    
    public Builder Address(String value){
            Address=value;
            return this;
        }
    
      public Builder Phone(String value){
            Phone=value;
            return this;
        }
      
       public Builder IdentificationNo(String value){
           IdentificationNo=value;
            return this;
        }

        public Builder persons(List<Person> value){
            persons=value;
            return this;
        }
        
         public Employee build(){
            return new Employee(this);
        }
    }
     public String getName() {
        return name;
    }
     
      public String getSurname() {
        return Surname;
    }
      
       public String getAddress() {
        return Address;
    }
       
        public String getPhone() {
        return Phone;
    }
      public String getIdentificationNo() {
        return IdentificationNo;

    }
      
      public List<Person> getPersons() {
        return persons;
    }
    
    @Override
    public String toString()

    {
     return "Name:"+this.name+"\nSurname: "+this.Surname;
    }
    @Override
    public boolean equals(Object employeeObject) {
        if (this == employeeObject) return true;
        if (employeeObject == null || getClass() != employeeObject.getClass()) return false;

         Employee employers = (Employee) employeeObject;

        if (!name.equals(employers.name)) return false;

        return true;
    }
   

       @Override
    public int hashCode() {
        return name.hashCode();
    }
}
    
