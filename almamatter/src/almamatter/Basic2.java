package almamatter;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the value of i..:");
			int i=scan.nextInt();
			System.out.println("Enter value for j..:");
			int j=scan.nextInt();
			int mul=i*j;
			System.out.println("The Multiplication of i and j is..:"+mul);
		}
		
	}
}
