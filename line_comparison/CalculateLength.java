package line_comparison;

import java.util.*;

public class CalculateLength {

	public static void main(String[] args) {
		// Variables
		double x1, y1, x2, y2;

		// Inputs
		Scanner myObj = new Scanner(System.in);

		// Numerical Inputs
		System.out.println("Enter Value Of x1");
		x1 = myObj.nextDouble();
		System.out.println("Enter Value Of y1");
		y1 = myObj.nextDouble();
		System.out.println("Enter Value Of x2");
		x2 = myObj.nextDouble();
		System.out.println("Enter Value Of y2");
		y2 = myObj.nextDouble();

		double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line is:" + length);
	}

}
