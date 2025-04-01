public class Trokut extends GeometrijskiLik {
    @Override
    public double opseg() {
        return stranicaA + stranicaB + stranicaC;
    }

    @Override
    public double povrsina() {
        double po = opseg() / 2;
        return Math.sqrt((po * (po - stranicaA) * ( po - stranicaB) * (po - stranicaC)));
    }

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }


    public double getStranicaA() {
        return this.stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return this.stranicaB;
    }
    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return this.stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;

    }
}






