package Lista10.Questao01;

class Triangle extends Shape2D {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String draw() {
        return "Triângulo | Lados: " + side1 + ", " + side2 + ", " + side3 +
               ". Área: " + area + ". Perímetro: " + perimeter;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}