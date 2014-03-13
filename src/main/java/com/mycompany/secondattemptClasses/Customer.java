/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattemptClasses;

import java.util.List;
/**
 *n
 * @author kurt wasserfall 211150142  3B
 */
public final class Customer{
    //extended person
    private final String name;
    private final String Surname;
    private final String Address;
    private final String Phone;
    private final String IdentificationNo;
    
    private final List<Person> persons;
    
 
    
  
    
    private Customer(Builder builder){
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
        
         public Customer build(){
            return new Customer(this);
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
     return "Name:"+this.name+"\nSurname: "+this.Surname+"\nIdentification no: "+this.IdentificationNo+
       "\nPhone: "+this.Phone+"\nAddress: "+this.Address;
    }
    @Override
    public boolean equals(Object customerObject) {
        if (this == customerObject) return true;
        if (customerObject == null || getClass() != customerObject.getClass()) return false;

         Customer customers = (Customer) customerObject;

        if (!name.equals(customers.name)) return false;

        return true;
    }
   

       @Override
    public int hashCode() {
        return name.hashCode();
    }
}
    
