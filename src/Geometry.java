//Logan Readinger
//CIT160
//4/26/2018
public class Geometry {

	public static double CircleArea(double radius) {
		double area = 0;
		
		if (radius <= 0) 
			System.out.println("Please enter a radius greater than 0");	
		else
			area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	public static double RectArea(double length, double width) {
		double area = 0;
		
		if (length <= 0)
			System.out.println("Please enter a length greater than 0");
		else
		{
			if (width <= 0)
				System.out.println("Please enter a width greater than 0");
			else
				area = length * width;
		}
		
		return area;
	}
	
	public static double TriangleArea(double base, double height) {
		double area = 0;
		
		if (base <= 0)
			System.out.println("Please enter a base greater than 0");
		else
		{
			if (height <= 0)
				System.out.println("Please enter a height greater than 0");
			else
				area = base * height * 0.5;
		}
		
		
		return area;
	}
	
}
