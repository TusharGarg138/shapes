// EquilateralPyramid.java
// Equilateral Pyramid class implementing Volume interface
class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double base, double height) {
        super(base, height, 0, 0);
    }

    public double calculateArea() {
        double baseArea = dim_one * dim_one;
        double sideArea = 4 * (0.5 * dim_one * dim_two);
        return baseArea + sideArea;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * dim_one * dim_one * dim_two;
    }

    public double calculatePerimeter() {
        return 4 * dim_one;
    }
}
