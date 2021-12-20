package com.desarrollos.entde;

import java.util.Arrays;
import java.awt.Color;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public  static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        slowDown();
        moveDown();
        accelerate();
        Garage.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    /**
     * Accelerate the car
     * @throws InterruptedException 
     */
    static public void accelerate() throws InterruptedException{ // a�adimos static
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    static public void slowDown() throws InterruptedException{ // a�adimos static
    	String c = new String("     *"); // String va con may�scula
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    static public void moveDown() throws InterruptedException{ // a�adimos static
    	String c = new String("\t\t\t\t  *"); // String con may�scula, sobra 1 ppar�ntesis
    	for(int i=0; i<5; i++) // se escribe ; no ,
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
