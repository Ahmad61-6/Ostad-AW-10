package exam_week_2_assignment.ShapeApplication.src;

class Circle extends Shape{
    double radius ;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("\nDrawing a circle: \n");
        int N = (int) (2*radius+1);
 
    int x, y;  // Coordinates inside the rectangle
 
    // Draw a square of size N*N.
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            // Start from the left most corner point
            x = (int) (i-radius);
            y = (int) (j-radius);
 
            // If this point is inside the circle, print it
            if (x*x + y*y <= radius*radius+1 )
                System.out.print(".");
            else // If outside the circle, print space
            System.out.print(" ");
            System.out.print(" ");
        }
        System.out.println();
    }
    }

}

