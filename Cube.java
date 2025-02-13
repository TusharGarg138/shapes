// Cube.java

import java.lang.*;
class Cube extends Shape{

	public Cube(double side){

		super(side, side, side, 6);
	}

	public double calculateArea(){

		return 6*dim_one*dim_two;
	
	}

	public double calculatePerimeter(){

		return 12*dim_one;
	}
}
