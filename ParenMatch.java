// ********************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************

import java.util.*;
import java.util.Scanner;

public class ParenMatch
{
	public static void main (String[] args)
	{
		//Print the part of the string up to where the error was detected
		Stack<Character> s = new Stack<Character>();
		String line; // the string of characters to be checked
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nParenthesis Matching");
		System.out.print ("Enter a parenthesized expression: ");
		line = scan.nextLine();
		
		String goodSoFar = "";
		boolean errorFound = false;
		
		// loop to process the line one character at a time
		for (int i = 0; i < line.length(); i++) 
		{
			char c = line.charAt(i);
			goodSoFar += c; // add the character to the string so far
			
			if(c== '(' )
			{
				// open parenthesis so you can add it to the stack
				s.push( line.charAt(i) );
			}
			else if(c == ')')
			{
				// hit close parenthesis to pull an open parenthesis off the stack
				if( s.size() > 0)
					s.pop();
				else
				{
					//stack does not have a matching parenthesis so it will show an error
					System.out.println("Error! Close parenthesis without a matching open parenthesis!");
					System.out.println("Error encountered here: " + goodSoFar + "^");
					errorFound = true;
					break; // break the loop
				}
			}
			
		}
		
		//check final stack
		if( s.size() > 0)
		{
			System.out.println( "Error! There are " + s.size() + "extra open parenthesis");
		}
		else
		{
			if( !errorFound)     //if (errorFound == false)
			System.out.println("The number of open parenthesis matched the number of closed parenthesis!");
		}
		
	}
}
