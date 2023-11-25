package Lista10.Questao01;

class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle() {
        super();
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String draw() {
        return "Retângulo | Comprimento: " + length + ". Largura: " + width +
               ". Área: " + area + ". Perímetro: " + perimeter;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
