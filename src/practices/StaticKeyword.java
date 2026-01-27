package practices;

public class StaticKeyword {
    public static double radius = 7;

    public  static double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
