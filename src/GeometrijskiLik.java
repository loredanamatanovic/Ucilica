
public abstract class GeometrijskiLik {

    private String naziv;


    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;

    }

    public abstract double opseg();


    abstract public double povrsina();

    @Override
    public String toString() {
        return "Naziv : " + this.naziv + " , Opseg: " + opseg() + " , Povrsina " + povrsina();
    }

}