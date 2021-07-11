package Double;

import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the width of rectangle:");
		double width=scanner.nextDouble();

		System.out.println("Enter the height of Rectangle:");
		double height=scanner.nextDouble();

		double area= (width*height)/2;
		System.out.println("Area of Rectangle is:"+area);
	
}

}
