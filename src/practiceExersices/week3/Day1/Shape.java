package practiceExersices.week3.Day1;

public abstract class Shape {
    private String color;
    private boolean filled;

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString() {
        return " ";
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.toString());
        Triangle triangle = new Triangle(10, 14, 17);
        System.out.println(triangle.toString());
        Shape rectangleOne = new Rectangle(2, 4);
        System.out.println(rectangleOne.toString());

    }
}
