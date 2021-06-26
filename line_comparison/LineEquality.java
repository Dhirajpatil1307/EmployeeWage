package line_comparison;

import java.util.Scanner;

public class LineEquality {
	void equality(){
		// Variables
		double x1, y1, x2, y2;
		double p1, q1, p2, q2;
		// Inputs
		Scanner myObj = new Scanner(System.in);

		// Numerical Inputs (x1,y1,x2,y2)
		System.out.println("Enter Value Of x1");
		x1 = myObj.nextDouble();
		System.out.println("Enter Value Of y1");
		y1 = myObj.nextDouble();
		System.out.println("Enter Value Of x2");
		x2 = myObj.nextDouble();
		System.out.println("Enter Value Of y2");
		y2 = myObj.nextDouble();

		double lengthforfirstline = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the first line is:" + lengthforfirstline);
		
		Scanner myObjone = new Scanner(System.in);

		// Numerical Inputs (p1,q1,p2,q2)
				System.out.println("Enter Value Of p1");
				p1 = myObjone.nextDouble();
				System.out.println("Enter Value Of q1");
				q1 = myObjone.nextDouble();
				System.out.println("Enter Value Of p2");
				p2 = myObjone.nextDouble();
				System.out.println("Enter Value Of q2");
				q2 = myObjone.nextDouble();
		
		double lengthforsecondline = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("Length of the line second is:" + lengthforsecondline);
	
		if(lengthforfirstline == lengthforsecondline) {
			
			System.out.println("Both lines are equal");
			}
		else {
			System.out.println("Both lines are not equal");
		}
	}

public static void main(String[] args) {
	LineEquality lineEquality = new LineEquality();
	lineEquality.equality();
}
}