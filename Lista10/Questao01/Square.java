package Lista10.Questao01;

class Square extends Shape2D {
    private double side;

    public Square() {
        super();
        this.side = 0.0;
    }

    public Square(double side) {
        super();
        this.side = side;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getSide() {
        return side;
    }

    @Override
    public String draw() {
        return "Quadrado | Lado: " + side + ". Área: " + area + ". Perímetro: " + perimeter;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
