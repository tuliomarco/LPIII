package Lista09;

public class Ponto3DAgregacao {
    private Ponto2D ponto2D;
    private double z;

    public Ponto3DAgregacao(Ponto2D ponto2D, double z) {
        this.ponto2D = ponto2D;
        this.z = z;
    }

    @Override
    public String toString() {
        return ponto2D.toString() + ", z=" + z;
    }

    public boolean inAxisX() {
        return ponto2D.inAxisX();
    }

    public boolean inAxisY() {
        return ponto2D.inAxisY();
    }

    public boolean inAxis() {
        return ponto2D.inAxis();
    }

    public boolean isOrigin() {
        return ponto2D.isOrigin() && z == 0;
    }

    public double distance(double x, double y, double z) {
        double distance2D = ponto2D.distance(x, y);
        return Math.sqrt(distance2D * distance2D + z * z);
    }

    public double distance(Ponto3DAgregacao ponto3D) {
        return distance(ponto3D.ponto2D.getX(), ponto3D.ponto2D.getY(), ponto3D.z);
    }
}

