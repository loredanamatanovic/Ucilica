
abstract class GeometrijskiLik extends Krug {
    private String naziv;


    public GeometrijskiLik(String krug11, double radijus) {
        super(krug11, radijus);
        }

        public String GeometrijskiLik(String naziv) {
            this.naziv = naziv;
            return naziv;


            abstract public double opseg ()


            abstract public double povrsina ();


            public String toString () {
                return "Naziv : " + this.naziv + " , Opseg: " + opseg() + " , Povrsina " + povrsina();
            }
        }
    }
}