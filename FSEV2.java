/*
***************************************************************************************
***************************************************************************************
** Name:        Madison Gosselin                                                     **
** File Name:   FSEV2                                                                **
** Student ID:  37701619                                                             **
** Description: This program will take in a text file that has multiple              **
**              battles with two players. There are 5 different types of soldiers    **
**              to play with and each player has 6 soldiers. This program calculates **
**              the strength of each players soldiers and gives an overall strength. **
**              It then calculates who wins between each player in each battle.This  **
**              uses a for loop to calculate each players strength with switches to  **
**              detect what each soldier is worth. This also uses a try and catch to **
**              catch errors so it doesn't crash.                                    **
***************************************************************************************
***************************************************************************************
*/

import java.io.*;

public class FSEV2
{
    public static void main (String[] args)
    {

	String player1 = "";  //create a string varaible called player 1 to hold fighters
	String player2 = "";  //create a string varaible called player 1 to hold fighters

	int battles = 0;      //create a variable to hold number of battles
	int player1Score = 0; //create a variable to hold player 1 score
	int player2Score = 0; //create a variable to hold player 2 score

	//create try 
	try
	{
	    System.out.println ("Battle Game"); //print title
	    System.out.println ("-----------"); //print a line

	    BufferedReader inputFile = new BufferedReader (new FileReader ("H:\\inputData.txt")); //create BufferedReader to read file

	    battles = Integer.parseInt (inputFile.readLine ());      //input first cahracter to var. battles

	    System.out.println ("Total of " + battles + " battles"); //

	    //create a for loop to read in the different players army
	    for (int y = 0 ; y < battles ; y++)
	    {
		player1 = inputFile.readLine (); //read in line and put into player1
		player2 = inputFile.readLine (); //read in line and put into player2

		//create a for loop to readin characters and calculate score for p1 and p2
		for (int x = 0 ; x < 11 ; x += 2)
		{
		    player1.charAt (x);         //read in character from var. player1

		    //create switch to read a character from player1
		    switch (player1.charAt (x))
		    {
			case 'K':                            //check if its K
			    player1Score = player1Score + 2; //add 2 to player1Score
			    break;                           //dont continue switch
			case 'T':                            //check if its T
			    player1Score = player1Score + 5; //add 5 to player1Score
			    break;                           //dont continue switch
			case 'S':                            //check if its S
			    player1Score = player1Score + 3; //add 3 to player1Score
			    break;                           //dont continue switch
			case 'A':                            //check if its A
			    player1Score = player1Score + 4; //add 4 to player1Score
			    break;                           //dont continue switch
			case 'F':                            //check if its F
			    player1Score = player1Score + 1; //add 1 to player1Score
		    } //end switch player 1

		    player2.charAt (x);         //read in character from var. player2

		    //create switch to read a character from player2
		    switch (player2.charAt (x))
		    {
			case 'K':                            //check if its K
			    player2Score = player2Score + 2; //add 2 to player2Score
			    break;                           //dont continue switch
			case 'T':                            //check if its T
			    player2Score = player2Score + 5; //add 5 to player2Score
			    break;                           //dont continue switch
			case 'S':                            //check if its S
			    player2Score = player2Score + 3; //add 3 to player2Score
			    break;                           //dont continue switch
			case 'A':                            //check if its A
			    player2Score = player2Score + 4; //add 4 to player2Score
			    break;                           //dont continue switch
			case 'F':                            //check if its F
			    player2Score = player2Score + 1; //add 1 to player2Score
		    } //end switch player 2

		} //end for loop (x)

		System.out.println ("Battle " + (y + 1) + ", Player 1 : Strength of " + player1Score); //print the battle number, that it is player 1, and the strength their army
		System.out.println ("Battle " + (y + 1) + ", Player 2 : Strength of " + player2Score); //print the battle number, that it is player 2, and the strength their army
		//create if to check whos score is the greatest or if there was a tie
		if (player1Score > player2Score)
		{
		    System.out.println ("Battle " + (y + 1) + " Winner    : Player 1\n");   //print that player1 won
		}//end if
		else if (player2Score > player1Score)
		{
		    System.out.println ("Battle " + (y + 1) + " Winner    : Player 2\n");   //print that player 2 won
		}//end else if
		else
		{
		    System.out.println ("Battle " + (y + 1) + " Winner    : TIE BATTLE\n"); //print that tie game
		}//end else
		player1Score = 0; //set player1Score to 0
		player2Score = 0; //set player2Score to 0
	    } //end for loop (y)
	    System.out.println ("End Of Battles"); //print your done the battles
	    inputFile.close ();                    //close file
	} //end try
	
	//create catch
	catch (IOException error)
	{
	    System.out.println ("You have generated an error"); //print that you have an error
	    System.out.println (error);                         //print error message
	}//end catch
    } //end main method
} //end FSEV2 class
