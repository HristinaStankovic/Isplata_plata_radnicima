package obracun_plata;

public class Radnik_po_satu extends Radnik{

    private int brojSati;
    private double cenaSata;
    private int radniDani;
    public Radnik_po_satu(String ime, String prezime, String jmbg, String ziroRacun, int brojSati, double cenaSata, int radniDani) {
        super(ime, prezime, jmbg, ziroRacun);
        this.brojSati=brojSati;
        this.cenaSata=cenaSata;
        this.radniDani=radniDani;
    }

    @Override
    public double isplatiPlatu() {
        plata = (cenaSata * brojSati) * radniDani;
        return plata;
    }
}
