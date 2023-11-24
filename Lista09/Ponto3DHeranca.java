package Lista09;

public class Ponto3DHeranca extends Ponto2D {
    private double z;

    public Ponto3DHeranca() {
        super();
        this.z = 0;
    }

    public Ponto3DHeranca(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z=" + z;
    }

    public boolean isOrigin() {
        return super.isOrigin() && z == 0;
    }

    public double distance(double x, double y, double z) {
        double distance2D = super.distance(x, y);
        return Math.sqrt(distance2D * distance2D + z * z);
    }

    public double distance(Ponto3DHeranca ponto3D) {
        return distance(ponto3D.getX(), ponto3D.getY(), ponto3D.z);
    }
}

