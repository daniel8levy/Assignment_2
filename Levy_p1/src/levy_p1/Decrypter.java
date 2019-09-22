package levy_p1;

import java.util.Scanner;

public class Decrypter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the encrypted string:  ");
		int st1 = in.nextInt();
		
		int x1 = st1 / 1000;
		int x2 = (st1 / 100) - x1 * 10;
		int x3 = (st1 / 10) - (x1 * 100) - x2 *10;
		int x4 = st1 - (x1 * 1000) - (x2 * 100) - (x3 * 10);
		
		int z1 = (x1 + 3) % 10;
		int z2 = (x2 + 3) % 10;
		int z3 = (x3 + 3) % 10;
		int z4 = (x4 + 3) % 10;
		
		int st2 = (z3 * 1000 + z4 * 100 + z1 * 10 + z2);
		
		
		System.out.println("The decrypted string is: " + st2);

	}

}
