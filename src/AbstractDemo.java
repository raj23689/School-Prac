abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area of Rectangle :: ");
        return (dim1 * dim2);
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area of triangle :: ");
        return ((dim1 * dim2) / 2);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 8);
        Triangle t = new Triangle(5, 8);
        System.out.println("Area of Triangle is :: " + t.area());
        System.out.println("Area of Rectangle is :: " + r.area());
    }
}
