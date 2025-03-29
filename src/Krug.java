public class Krug {


    private String naziv;
    private double radijus;

    public Krug(String krug11, double radijus) {
        this.naziv = krug11;
        this.radijus = radijus;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String krug) {
        this.naziv = krug;
    }

    public double getRadijus() {
        return this.radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;

    }
}