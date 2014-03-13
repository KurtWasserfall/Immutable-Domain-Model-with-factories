package com.mycompany.secondattemptrunMain;

import com.mycompany.secondattemptClasses.Customer;
import com.mycompany.secondattemptClasses.Employee;
import com.mycompany.secondattemptClasses.carBMW;
import com.mycompany.secondattemptClasses.carMAZDA;
import com.mycompany.secondattemptClasses.carVOLGSWAGEN;
//import com.kurtwasserfall.ooexampleondomain.Classes.Employee;

/**
 * @author kurt wasserfall 211150142 3B
 *
 */
public class RunMain 
{
    public static void main( String[] args )
    {
     //This is for testing my objects from main
        
        //Customer 1
       Customer customer1 = new Customer.Builder("John").Surname("Hendricks").IdentificationNo("4568937463528").Phone("0217012344").Address("20 Garden road Cape Town").build();
       Employee employer1 = new Employee.Builder("Darrel").Surname("van reenan").IdentificationNo("3428933400528").Phone("021701674").Address("30 malmes street strand").build();
       carBMW car1 = new carBMW.Builder("2006 3 series").Colour("Red").Damaged("Fender").PartNo("ex3212").build();
      
       //Customer2
       Customer customer2 = new Customer.Builder("Boniface").Surname("Kabaso").IdentificationNo("6788937463528").Phone("02166512343").Address("1 Flute road Carnival").build();
       Employee employer2 = new Employee.Builder("kurt").Surname("Wasserfall").IdentificationNo("5677833400528").Phone("0217016743").Address("23 Boat street parrow").build();
       carVOLGSWAGEN car2= new carVOLGSWAGEN.Builder("2013 Golf 6 R-line").Colour("White").Damaged("Bumper").PartNo("vw342").build();
       
      //customer3
       Customer customer3 = new Customer.Builder("Mandy").Surname("Solomons").IdentificationNo("8978907463528").Phone("021701234").Address("21 Alisa road Muizenberg").build();
       Employee employer3 = new Employee.Builder("Yori").Surname("Fagon").IdentificationNo("5675673400528").Phone("021702674").Address("5 St Peters way strand").build();
       carMAZDA car3 = new carMAZDA.Builder("2011 mps").Colour("Yellow").Damaged("Boonet,Fender,Headlight").PartNo("b3212,b2342,b02").build();
       
       //Better solution is for me to put display in for loop,but that will come in later stage
       //as i build onto this domain project
       System.out.println("KURTS COACH WORKS PANELBEATING TODAY SCHEDULE");
        System.out.println("********************************************");
       System.out.println("Customer details...");
       System.out.println(customer1);
       System.out.println("\nEMPLOYER WORKING ON "+customer1.getName()+" "+customer1.getSurname()+" CAR IS.");
       System.out.println(employer1);
       System.out.println("\nVehicle Details");
       System.out.println(car1);
       
       System.out.println("\n\nCustomer details...");
       System.out.println(customer2);
       System.out.println("\nEMPLOYER WORKING ON "+customer2.getName()+" "+customer2.getSurname()+" CAR IS.");
       System.out.println(employer2);
       System.out.println("\nVehicle Details");
       System.out.println(car2);
       
       System.out.println("\n\nCustomer details...");
       System.out.println(customer3);
       System.out.println("\nEMPLOYER WORKING ON "+customer3.getName()+" "+customer3.getSurname()+" CAR IS.");
       System.out.println(employer3);
       System.out.println("\nVehicle Details");
       System.out.println(car3);
       
    }
              
}
