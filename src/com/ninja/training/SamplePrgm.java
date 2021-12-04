package com.ninja.training;

import java.util.Scanner;

public class SamplePrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* [DIFFICULT] 8. Keep getting input from user for 5 times. Store all the inputs given by
		the user in an array. Loop through the array using For Each loop and print all the
		movie names entered by the user. */
		
		int[] movieNumbers = {1, 2, 3, 4, 5};
		
		String[] movieNames = {"Harry Potter and the Philosopher's Stone",
				"Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban",
				"Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix"};
		
		System.out.println("Enter 5 Movie Numbers: ");
		
		for ( int i = 0; i < 5 ; i++)
		{
			Scanner input = new Scanner(System.in);
			int movieNumber = input.nextInt();
		}
		
		//For each loop
		for ( String movieNames1 : movieNames)
		{
			System.out.println(movieNames1);
		}
		
		

	}//End of Main

}//End of Class
