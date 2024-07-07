package exam_week_2_assignment.ShapeApplication.src;

public class App {
    public static void main(String[] args) throws Exception {
        Shape circle = new Circle(6.0);
        System.out.println("Area of Circle: " + circle.calculateArea());
        circle.draw();

        Shape square = new Square(5.0);
        System.out.println("Area of Square: " + square.calculateArea());
        square.draw();

        Shape triangle = new Triangle(4.0, 5.0);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        triangle.draw();
    }
}
