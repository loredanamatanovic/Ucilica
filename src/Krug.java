public class Krug {


    private String naziv; //naziv i radijus su 2 polja / ili karakteristike
    private double radijus;

    public Krug(String krug, double radijus) {
        this.naziv = krug;
        this.radijus = radijus;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String krug) {
        this.naziv = krug;
    }

    public double getRadijus() {
        return radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;

    }
}
