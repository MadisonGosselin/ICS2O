/*
************************************************************
************************************************************
** Name: Madison Gosselin                                 **
** File Name: TestProgramFiles.java                       **
** Student ID: 37701619                                   **
** Description: Pizza cost generator that calculates      **
**              cost / Sq inch of pizzas WITH AGRS        **
************************************************************
************************************************************
*/


// The "TestProgram" class.

import java.io.*;

public class TestProgramFiles
{
    public static void main (String[] args)
    {
	String inputLineOfData = "";             //create a string variable 

	int pizzaRadius[]   = new int [500];       //create an argument pizzaRadius with 500 pockets
	double pizzaCost[]  = new double [500];   //create an argument pizzaCost with 500 pockets
	double pizzaValue[] = new double [500];  //create an argument pizzaValue with 500 pockets

	int counter = 0;

	double cheapestPizza    = 9999.99;        //create a variable cheapestPizza to 9999.99
	int cheapestPizzaNumber = 0;             //create variable cheapestPizzaNumber

	try
	{

	    BufferedReader inputFile  = new BufferedReader (new FileReader ("H:\\pizzaData.txt")); //create a buffered reader to read file "pizzaData"

	    inputLineOfData           = inputFile.readLine ();                                     //read line 

	    while (inputLineOfData   != null)
	    {
	    
		pizzaRadius [counter] = Integer.parseInt (inputLineOfData);                       //read line of data and put into pizzaRadius value pocket of counter value           
		inputLineOfData       = inputFile.readLine ();                                    //read in next line
		pizzaCost [counter]   = Double.parseDouble (inputLineOfData);                     //read line of data and put into pizzaRadius value pocket of counter value
		inputLineOfData       = inputFile.readLine ();                                    //read in next line
		pizzaValue [counter]  = pizzaCost [counter] / (3.1415 * pizzaRadius [counter] * pizzaRadius [counter]); //read line of data and calculate the value
		    
		if(pizzaValue[counter] < cheapestPizza) {
		    
		    cheapestPizza       = pizzaValue[counter]; //set cheapestPizza = to pizzaValue
		    cheapestPizzaNumber = counter + 1;         //set cheapest number to counter + 1
		    
		}//end of if
		    
		counter++; //increase counter by 1
		
	    } //end of while loop

	    //print out our report
	    System.out.println ("Pizza Value Calculator");
	    System.out.println ("----------------------" + "\n");

	    //print sub heading
	    System.out.println ("Pizza Number\tPizza Radius\tPizza Cost\tPizza Cost/Sq Inch");

	    for(int x = 0; x < counter; x++) {

		//print values
		System.out.println (x +1 + "\t\t" + pizzaRadius[x] + "\t\t" + pizzaCost[x] + "\t\t" + pizzaValue[x]);

	    } //end of for loop with x = 0 int new line
	    
	    //print new line
	    System.out.print   ("\n");

	    //print what the cheapest pizza is
	    System.out.println ("The best pizza is number:\t" + cheapestPizzaNumber + "\tThe cost/Sq Inch is:\t"+ cheapestPizza);
	    
	    //close file
	    inputFile.close();

	    } // end of try

	catch (IOException error)
	{
	    //print your error
	    System.out.println ("you generated an error");
	    System.out.println (error);

	} //end catch

    } // end of main method
} // end of class TestProgramFiles
