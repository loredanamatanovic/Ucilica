public class Pravokutnik extends GeometrijskiLik {

    private double stranicaA;
    private double stranicaB;

    public Pravokutnik (String naziv, double stranicaA, double stranicaB) {
        super(naziv);
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

    @Override
    public double opseg() {
         return 2 * this.stranicaA + 2 * this.stranicaB;
    }

    @Override
    public double povrsina() {
        return  stranicaA * stranicaB;
    }
}




