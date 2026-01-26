package practiceExersices.week3.Day1;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(double base, double height, double hypotenuse) {
        if (base <= 0.0) {
            throw new IllegalArgumentException("Widht cannot be 0 or negative");
        }
        this.base = base;

        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be 0 or negative");
        }
        this.height = height;

        if (hypotenuse <= 0) {
            throw new IllegalArgumentException("hypotenuse cannot be 0 or negative");
        }
        this.hypotenuse = hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getArea() {
        double area = (getBase() * getHeight())/ 2;
        System.out.println(" "+ area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = getBase() + getHeight() + getHypotenuse();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Area of Triangle: "+ getArea() +
                ". Perimeter of Triangle: "+ getPerimeter();
    }
}
