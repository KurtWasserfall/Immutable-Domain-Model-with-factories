/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattemptClasses;

import java.util.List;

/**
 *
 *  @author kurt wasserfall 211150142  3B
 */
public final class carBMW {
    
     private final String CarModel;
     private final String Colour;
     private final String Damaged;
     private final String PartNo;
    
     private final List<Vehicle> vehicles;
     
    
     
      private carBMW(carBMW.Builder builder){
        CarModel = builder.CarModel;
        Colour = builder.Colour;
        Damaged=builder.Damaged;
        PartNo=builder.PartNo;
        
        vehicles=builder.vehicles;
    }
      
    public static class Builder
    {
    
     private String CarModel;
     private String Colour;
     private String Damaged;
     private String PartNo;
    
     private List<Vehicle> vehicles;
     
    
    
    public Builder(String CarModel){
    
        this.CarModel = CarModel;
    } 
    
    public Builder Colour(String value){
            Colour=value;
            return this;
        }
    
    public Builder Damaged(String value){
            Damaged=value;
            return this;
        }
    
      public Builder PartNo(String value){
            PartNo=value;
            return this;
      }
    
        public Builder vehicles(List<Vehicle> value){
           vehicles=value;
            return this;
        }
        
         public carBMW build(){
            return new carBMW(this);
        }
    }
    
       public String getCarModel() {
        return CarModel;
    }
     
      public String getColour() {
        return Colour;
    }
      
       public String getDamaged() {
        return Damaged;
    }
       
        public String getPartNo() {
        return PartNo;
    }
   
  
      
      public List<Vehicle> getVehicles() {
        return vehicles;
    }
    
      @Override
    public String toString()

    {
     return "Manufacturer BMW"+"\nCar Model: "+this.CarModel+"\nColour: "+this.Colour+
             "\nDamages: "+this.Damaged+"\nPart No: "+this.PartNo;
    }
    @Override
    public boolean equals(Object vehicleObject) {
        if (this == vehicleObject) return true;
        if (vehicleObject == null || getClass() != vehicleObject.getClass()) return false;

         carBMW carbmws = (carBMW) vehicleObject;

        if (!CarModel.equals(carbmws.CarModel)) return false;

        return true;
    }
   

       @Override
    public int hashCode() {
        return CarModel.hashCode();
    }
}
