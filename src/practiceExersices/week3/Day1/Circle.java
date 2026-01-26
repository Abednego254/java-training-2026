package practiceExersices.week3.Day1;

public class Circle extends Shape {
    private final double radius = 7;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * getRadius() * getRadius();
        return area;
    }

    public double getPerimeter() {
        double circumference = Math.PI * (getRadius() *2);
        return circumference;
    }

    @Override
    public String toString() {
        return "Area of circle: "+ getArea() +"; Perimeter of circle: "+ getPerimeter();
    }
}
