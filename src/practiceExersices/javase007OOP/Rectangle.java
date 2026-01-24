package practiceExersices.javase007OOP;

public class Rectangle {
    public double width;
    public double height;
    public double length;

    public Rectangle () {
        width = 0.0;
        height = 0.0;
    }

    public  Rectangle (double rectangleWidth, double rectangleHeight) {
        this.height = rectangleHeight;
        this.width = rectangleWidth;
    }

    public  Rectangle (double len) {
        this.length = len;
    }

    public void calculateArea() {
        double areaOfRectangle = width * height;
        double areaOfSquare = length * length;
        System.out.println("Area of Rectangle: "+ areaOfRectangle);
        System.out.println("Area of square: "+ areaOfSquare);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 20.0;
        rectangle.height = 10.0;
        rectangle.length = 10;

        rectangle.calculateArea();
    }
}
