import Task3_GeometricFigures.Square;
import Task3_GeometricFigures.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(8);
        System.out.println(square.getArea());
        Triangle triangle = new Triangle(5,6,7);
        System.out.println(triangle.getArea());
    }
}