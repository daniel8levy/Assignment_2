package levy_p3;

import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;



public class Levy_p3 {
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String topics[] = {"Economy", "Immigration", "Judges", "Foreign_Policy" , "Domestic_Policy"};
		int people = 0;
		
		
		
		
		
		
		//get number of people participating
		System.out.print("Welcome to BasicPolling2019. To start, please enter the amount of people taking this poll.: ");
		people = in.nextInt();
		
		int[][] responses = new int[5][10]; 
		
		 
		
		//Collect polling data
		for (int counter = 0; counter<people; counter++) {		
			System.out.println("Please rate how important this topic is to you on a scale of 1-10: " + topics[0]);
			 responses[0][counter] = in.nextInt();
	}
		
		for (int counter = 0; counter<people; counter++) {			
			System.out.println("Please rate how important this topic is to you on a scale of 1-10: " + topics[1]);
			 responses[1][counter] = in.nextInt();
	}

		for (int counter = 0; counter<people; counter++) {	
	System.out.println("Please rate how important this topic is to you on a scale of 1-10: " + topics[2]);
			 responses[2][counter] = in.nextInt();
    }

		for (int counter = 0; counter<people; counter++) {	
	System.out.println("Please rate how important this topic is to you on a scale of 1-10: " + topics[3]);
			 responses[3][counter] = in.nextInt();
	}
		
		for (int counter = 0; counter<people; counter++) {	
	System.out.println("Please rate how important this topic is to you on a scale of 1-10: " + topics[4]);
			 responses[4][counter] = in.nextInt();
	}

		
			// Display table		
		System.out.println("Topics \t \t Ratings \t \t \t");
			System.out.print(topics[0] + "         ");
			
			for(int j = 0; j < people; j++) {
		System.out.print(" " + responses[0][j] + " ");			
			}			
			
		
			        
			    
			    
				
				
				
			
			
			System.out.println();
	
			
System.out.print(topics[1] + "     ");
			
			for(int j = 0; j < people; j++) {
		System.out.print(" " + responses[1][j] + " ");
		
			
			}
			
			System.out.println();
	
			
System.out.print(topics[2] + "          ");
			
			for(int j = 0; j < people ; j++) {
		System.out.print(" " + responses[2][j] + " ");
		
			
			}
			System.out.println();
			
System.out.print(topics[3] + "  ");
			
			for(int j = 0; j < people ; j++) {
		System.out.print(" " + responses[3][j] + " ");
		
			
			}	
			System.out.println();
	
	
System.out.print(topics[4] + " ");
			
			for(int j = 0; j < people ; j++) {
		System.out.print(" " + responses[4][j] + " ");
		
			
			}	
			System.out.println();
	
	
}


	

}