public class Krug extends GeometrijskiLik {


    private double radijus;

    public Krug() {
        super(naziv);
        this.radijus = radijus;

    }

    public double getRadijus() {
        return this.radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;
    }


    @Override
    public double opseg() {
        return (2 * this.radijus * Math.PI);
    }

    @Override
    public double povrsina() {
        return (Math.pow(this.radijus , 2));

    }
}





