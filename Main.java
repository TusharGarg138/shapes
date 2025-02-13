// Main.java

import java.util.*;

class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		System.out.println("enter base of triangle");
		double base = Double.parseDouble(scan.nextLine());

		System.out.println("enter height of triangle");
		double height = Double.parseDouble(scan.nextLine());

		Shape triangle = new Triangle(base, height);

		System.out.println("____________________________");
		System.out.println("Area of triangle is:"+ triangle.calculateArea());
		System.out.println("perimeter of triangle is:"+ triangle.calculatePerimeter());
		System.out.println("____________________________");


		System.out.println("enter length of rectangle");
		double length = Double.parseDouble(scan.nextLine());

		System.out.println("enter breath of triangle");
		double breath = Double.parseDouble(scan.nextLine());

		Shape rectangle = new Rectangle(base, height);

		System.out.println("____________________________");
		System.out.println("Area of Rectangle is:"+ rectangle.calculateArea());
		System.out.println("perimeter of Rectangle is:"+ rectangle.calculatePerimeter());
		System.out.println("____________________________");

		System.out.println("enter side of cube");
		double side = Double.parseDouble(scan.nextLine());

		// System.out.println("enter breath of triangle");
		// double breath = Double.parseDouble(scan.nextLine());

		Shape cube = new Cube(side);

		System.out.println("____________________________");
		System.out.println("Area of Rectangle is:"+ cube.calculateArea());
		System.out.println("perimeter of Rectangle is:"+ cube.calculatePerimeter());
		System.out.println("____________________________");

}
}