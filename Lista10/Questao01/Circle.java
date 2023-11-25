package Lista10.Questao01;

class Circle extends Shape2D {
    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String draw() {
        return "Círculo | Raio: " + radius + ". Área: " + area + ". Perímetro: " + perimeter;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
