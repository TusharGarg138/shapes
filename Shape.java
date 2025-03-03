// Shape.java
// Abstract class defining basic properties and methods
abstract class Shape {
    protected double dim_one, dim_two, dim_three;
    protected int sides;

    public Shape(double dim_one, double dim_two, double dim_three, int sides) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.sides = sides;
    }

    // Abstract methods for area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Interface for volume calculations
interface Volume {
    double calculateVolume();
}
