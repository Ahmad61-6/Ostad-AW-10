package exam_week_2_assignment.ShapeApplication.src;

class Triangle extends Shape{
     double base;
     double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5*base*height;
    }

    @Override
    void draw() {
        System.out.println("\nDrawing a Triangle: \n");
        double mid = base / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                if (j == mid - i || j == mid + i || (i == height - 1 && j >= mid - i && j <= mid + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }


