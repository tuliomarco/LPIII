package Lista10.Questao01;

public class Shape2D {
    protected double area;
    protected double perimeter;

    public Shape2D() {
        this(0.0, 0.0);
    }

    public Shape2D(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String draw() {
        return "Generic 2D shape";
    }

    public double calculateArea() {
        return area;
    }

    public double calculatePerimeter() {
        return perimeter;
    }
}
