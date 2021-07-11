package almamatter;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter an Integer number");
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		if(num%2==0)
			System.out.println("Entered number in even");
		else
			System.out.println("Entered number in odd");
	}

}
