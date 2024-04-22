package obracun_plata;

public class Radnik_po_danu extends Radnik{

    private final int radniSati = 8;
    private double dnevnica;
    private double radniDani;
    public Radnik_po_danu(String ime, String prezime, String jmbg, String ziroRacun, double dnevnica, int radniDani) {
        super(ime, prezime, jmbg, ziroRacun);
        this.dnevnica = dnevnica;
        this.radniDani = radniDani;
    }

    @Override
    public double isplatiPlatu() {

        plata = (radniSati * dnevnica) * radniDani;
        return plata;
    }
}
