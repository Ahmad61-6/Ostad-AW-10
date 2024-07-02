package exam_week_2;

public class ShapeApplication {
    public static void main(String[] args) {
        
    }
    
}

abstract class Shape{
    public void draw(String shape){
            System.out.println("Drawing a "+shape);
    }
    abstract double calculateArea();
}
class Circle extends Shape{

    @Override
    double calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }

}

class Square extends Shape{

    @Override
    double calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }

}

class Triangle extends Shape{

    @Override
    double calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }

}
