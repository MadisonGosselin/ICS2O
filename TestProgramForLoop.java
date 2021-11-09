
/*
************************************************************
************************************************************
** Name: Madison Gosselin                                 **
** File Name: TestProgram.java                            **
** Student ID: 37701619                                   **
** Description: Pizza cost generator that calculates      **
**              cost / Sq inch of pizzas WITH AGRS        **
************************************************************
************************************************************
*/


// The "TestProgram" class.
public class TestProgramForLoop
{
    public static void main (String[] args)
    {
    
	int    pizzaRadius[] = new int    [3]; //create an argument pizzaRadius
	double pizzaCost[]   = new double [3]; //create an argument pizzaCost
	double pizzaValue[]  = new double [3]; //create an argument pizzaValue
	
	double cheapestPizza       = 9999.99; //create a variable cheapestPizza to 9999.99
	int    cheapestPizzaNumber = 0;       //create variable cheapestPizzaNumber
    
	for(int x = 0; x < 3; x++) {
	
	    pizzaRadius[x] = Integer.parseInt(args[x * 2]); //sets argument to x * 2
	    pizzaCost[x]   = Double.parseDouble(args[x * 2 + 1]); // sets argument to x * 2 + 1
	    pizzaValue[x]  = pizzaCost[x] / ( 3.1415 * pizzaRadius[x] * pizzaRadius[x]); //calculate pizzaValue  
	    
	    if (pizzaValue[x] < cheapestPizza) {
	    
		cheapestPizza       = pizzaValue[x]; // set cheapest pizza to pizza value
		cheapestPizzaNumber = x + 1;         //set cheapest pizza number to number of pizza
		
	    }//end of if statement pizzaValue < cheapestPizza
	    
	} // end of for loop with (x)
	
	//print out our report
	System.out.println ("Pizza Value Calculator");
	System.out.println ("----------------------" + "\n");
	
	//print sub heading
	System.out.println ("Pizza Number\tPizza Radius\tPizza Cost\tPizza Cost/Sq Inch");
	
	for(int x = 0; x < 3; x++) {
	
	    //print values
	    System.out.println (x +1 + "\t\t" + pizzaRadius[x] + "\t\t" + pizzaCost[x] + "\t\t" + pizzaValue[x]);
	
	} //end of for loop with x = 0
	
	
	//print new line
	System.out.print ("\n");

	//print what the cheapest pizza is
	System.out.println ("The number of the best pizza is:\t" + cheapestPizzaNumber + "\tThe cost/Sq Inch is:\t"+ cheapestPizza);
	
    } //End of main method
} // TestProgram class
