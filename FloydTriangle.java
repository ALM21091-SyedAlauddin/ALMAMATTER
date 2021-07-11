package Looping;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int row, number=1, counter, j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of row for floyd's triangle");
		
		row=input.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("****************");
				for(counter=1;counter<=row;counter++)
				{
					for(j=1;j<=counter;j++)
					{
						System.out.println(number+" ");
						number++;					
					}
					System.out.println();
				}

	}

}
