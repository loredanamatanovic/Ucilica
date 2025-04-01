public class Krug {


    private double radijus;

    public Krug(String krug11, double radijus) {

    }

    public double getRadijus() {
        return this.radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;
    }

    public double opseg() {
        this.radijus = (2 * radijus * Math.PI);

    }

    public void povrsina() {
        double povrsina = (Math.pow(radijus, 2));

    }
}

