package exam_week_2_assignment.ShapeApplication.src;

class Square extends Shape{
    double length;

    public Square(double lenght) {
        this.length = lenght;
    }

    @Override
    double calculateArea() {
        return length*length;
    }

    @Override
    void draw() {
        System.out.println("\nDrawing a Square: \n");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == length - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}