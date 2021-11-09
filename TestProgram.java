
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
public class TestProgram
{
    public static void main (String[] args)
    {
	int    pizzaOneRadius   = Integer.parseInt  (args[0]); //Radius of pizza one
	int    pizzaTwoRadius   = Integer.parseInt  (args[2]); //Radius of pizza two
	int    pizzaThreeRadius = Integer.parseInt  (args[4]); //Radius of pizza three
	
	double pizzaOneCost     = Double.parseDouble(args[1]); //Cost of pizza one
	double pizzaTwoCost     = Double.parseDouble(args[3]); //Cost of pizza two
	double pizzaThreeCost   = Double.parseDouble(args[5]); //Cost of pizza three
	
	double pizzaOneValue    = 0.00;  //pizza one cost/square inch
	double pizzaTwoValue    = 0.00;  //pizza two cost/square inch
	double pizzaThreeValue  = 0.00;  //pizza three cost/square inch
	
	double cheapestPizza    = 0.00;  //cheapest pizza
	
	//calculate cost/area of pizza for each of the 3 pizzas
	pizzaOneValue   = pizzaOneCost   / (3.1415 * pizzaOneRadius   * pizzaOneRadius);
	pizzaTwoValue   = pizzaTwoCost   / (3.1415 * pizzaTwoRadius   * pizzaTwoRadius);
	pizzaThreeValue = pizzaThreeCost / (3.1415 * pizzaThreeRadius * pizzaThreeRadius);
	
	if ((pizzaOneValue < pizzaTwoValue) && (pizzaOneValue < pizzaThreeValue)) {
	
	    cheapestPizza = pizzaOneValue;   //set cheapest pizza to pizza one cost
	    
	} else if( pizzaTwoValue < pizzaThreeValue) {
	
	    cheapestPizza = pizzaTwoValue;   //set cheapest pizza to pizza two cost
	
	}else {
	
	    cheapestPizza = pizzaThreeValue; //set cheapest pizza to pizza three cost
	
	} //End of if (pizzaOneValue < 2) && (pizzaOneValue < 3)
	
	//print out our report
	System.out.println ("Pizza Value Calculator");
	System.out.println ("----------------------" + "\n");
	
	//print sub heading
	System.out.println ("Pizza Number\tPizza Radius\tPizza Cost\tPizza Cost/Sq Inch");
	
	//print actual data
	System.out.println ("1\t\t" + pizzaOneRadius      + "\t\t" + pizzaOneCost   + "\t \t"  + pizzaOneValue);
	System.out.println ("2\t\t" + pizzaTwoRadius      + "\t\t" + pizzaTwoCost   + "\t \t"  + pizzaTwoValue);
	System.out.println ("3\t\t" + pizzaThreeRadius    + "\t\t" + pizzaThreeCost + "\t \t"  + pizzaThreeValue + "\n");

	//print what the cheapest pizza is
	System.out.println ("The best pizza to buy is:\t" + cheapestPizza);
	
    } //End of main method
} // TestProgram class
