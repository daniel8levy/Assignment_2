
import java.util.Scanner;

public class levy__p2 {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	System.out.println("Welcome to the BMI calculator. Use this to get an accurate picture of your current health!");
	System.out.print("Please enter your Height in inches: ");
	double ht = in.nextInt();
	System.out.print("Please enter your Weight in pounds: ");
	double wt = in.nextInt();
	
	System.out.println("Please select '1' for BMI formula 1 or '2' for BMI formula 2");
	int c = in.nextInt();
	
	if ( c == 1) {
		double BMI = (703 * wt) / (ht * ht);
		System.out.print("Your BMI is: ");
		System.out.print(BMI);
		
		
	}
	if (c == 2) { 
		double wt2 = (wt / 2.2);
		double ht2 = (ht / 39.37);
		double BMI = (wt2) / (ht2 * ht2);
		System.out.print("Your BMI is: ");
		System.out.println(BMI);
		
	}
	
	System.out.println("These are the BMI categories according to the National Heart Lung and Blood Institute. Please compare yours.");
	System.out.print("Underweight = <18.5\n" + 
			"Normal weight = 18.5–24.9\n" + 
			"Overweight = 25–29.9\n" + 
			"Obesity = BMI of 30 or greater");
	
	
	
				
				

	}

}
