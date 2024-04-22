package obracun_plata;

public class Main {
    public static void main(String[] args) {

        Radnik_po_satu radnikPoSatu = new Radnik_po_satu("Jelisaveta", "Mitrović", "1111098765467","180-00006566543-09",20,200.00, 15);
        System.out.println(isplatiPlatuZaRadnika(radnikPoSatu));

        Radnik_po_danu radnikPoDanu = new Radnik_po_danu("Rajko", "Kalicanin", "1906775463543", "160-000000646-66",5000,20);
        System.out.println(isplatiPlatuZaRadnika(radnikPoDanu));

        Radnik_fiksno radnikFiksno = new Radnik_fiksno("Klara", "Isaković", "1903994768036", "265-000075654848-45");
        System.out.println(isplatiPlatuZaRadnika(radnikFiksno));

    }

    public static String isplatiPlatuZaRadnika(Radnik radnik) {
        System.out.println(radnik);
        System.out.println("Obračun plate: " + radnik.isplatiPlatu());
        System.out.printf("---------------------------");
        return "Plata je isplaćena.";
    }
}