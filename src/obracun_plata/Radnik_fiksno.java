package obracun_plata;

public class Radnik_fiksno extends Radnik{

    public final int radniDaniUMesecu = 25;
    public final double dnevnica = 5000;
    public Radnik_fiksno(String ime, String prezime, String jmbg, String ziroRacun) {
        super(ime, prezime, jmbg, ziroRacun);
    }

    @Override
    public double isplatiPlatu() {

        plata = radniDaniUMesecu * dnevnica;
        return plata;
    }
}
