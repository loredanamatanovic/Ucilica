
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

    abstract public double opseg();


    abstract public double povrsina();


    public String toString() {
        return "Naziv : " + this.naziv + " , Opseg: " + opseg() + " , Povrsina " + povrsina();
    }
}

