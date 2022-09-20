package assignment2;

import java.util.Scanner;

public class NIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);

		System.out.print("Starting amount of Sticks: ");
		int startingAmount = in.nextInt();
			
		int X = startingAmount;
		int Y = 0;

		for (X=startingAmount; X >= 1; Y++)
		{
			
		System.out.print("Round " + Y + ": ");
		System.out.print(X + " at start, how many will you take? "); 
		int sticks = in.nextInt();
		
			if (sticks > 2 | sticks < 1)
			{
				System.out.print("Error, you cannot take that many sticks");
				System.out.println("");
		}
			if (sticks >= 1 && sticks <= 2)
			
			{
				X = X - sticks;
				if (X >= 1)
				{
					double rand = Math.random();
				
					if (rand > 0.5)
					{
						X = X - 1;
					System.out.println("Computer takes 1 so "  + X + " remain ");
					System.out.println("");
				
					}
					if (rand < 0.5)
					{
						X = X - 2;
						System.out.println("Computer takes 2 so "  + X + " remain ");
						System.out.println("");
					}
				}
			}
			
			
			if (X == 0)
			{
				System.out.println("you win // the computer loses!");
		
			}
			
		}		
											}

					}