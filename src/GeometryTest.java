//Logan Readinger
//CIT160
//4/26/2018
import java.util.Scanner;

public class GeometryTest {
		static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int input = 0;
		
		while(true){
			//Display the menu
			Menu();
			
			//Get user's response
			input = sc.nextInt();
			
			//Circle Area
			if(input == 1) {
				CircleSelection();
			}
			
			//Rectangle Area
			else if (input == 2) {
				RectangleSelection();
			}
			
			//Triangle Area
			else if (input == 3) {
				TriangleSelection();
			}
			
			//Quit
			else if (input == 4) {
				System.out.println("Application is closing...");
				System.exit(0);
			}

			//Error Catching
			else
				System.out.println("Enter a valid selection");
		}
	}

	public static void Menu() {
		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
		System.out.println();
		System.out.println("Enter your choice (1-4):");
	}
	
	public static void CircleSelection() {
		//Variable Declaration
		double radius = 0;
		double area = 0;
		
		//Input
		System.out.println("Enter a radius: ");
		radius = sc.nextDouble();
		
		//Validation and Method Calling
		if (radius > 0) {
			area = Geometry.CircleArea(radius);
			System.out.printf("Area: %.2f", area);
			System.out.println();
		}
		else
			System.out.println("Enter a valid radius");
	}
	
	public static void RectangleSelection() {
		//Variable Declaration
		double length = 0;
		double width = 0;
		double area = 0;
		
		//Input
		System.out.println("Enter a length: ");
		length = sc.nextDouble();
		
		//Validation and Method Calling
		if (length > 0)
		{
			System.out.println("Enter a width: ");
			width = sc.nextDouble();
			if (width > 0) {
				area = Geometry.RectArea(length, width);
				System.out.printf("Area: %.2f", area);
				System.out.println();
			}
			else
				System.out.println("Enter a valid width");
		}
		else
			System.out.println("Enter a valid length");
	}

	public static void TriangleSelection() {
		//Variable Declaration
		double base = 0;
		double height = 0;
		double area = 0;
		
		//Input
		System.out.println("Enter a base length: ");
		base = sc.nextDouble();
		//Validation and Method Calling
		if (base > 0)
		{
			System.out.println("Enter a height: ");
			height = sc.nextDouble();
			if (height > 0) {
				area = Geometry.TriangleArea(base, height);
				System.out.printf("Area: %.2f", area);
				System.out.println();
			}
			else
				System.out.println("Enter a valid height");
		}
		else
			System.out.println("Enter a valid base length");
	}

}

