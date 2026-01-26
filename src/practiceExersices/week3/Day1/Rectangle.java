package practiceExersices.week3.Day1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0.0) {
            throw new IllegalArgumentException("Widht cannot be 0 or negative");
        }
        this.width = width;

        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be 0 or negative");
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area = getWidth() * getHeight();
        return area;
    }

    public double getPerimeter() {
        return (getWidth() + getHeight()) * 2;
    }

    @Override
    public String toString() {
        return "Area of Rectangle: "+ getArea() +
                ". Perimeter of Rectangle: "+ getPerimeter();
    }
}
