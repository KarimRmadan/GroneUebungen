public class Alish {
    public static void main(String[] args) {
        double hering = 3.35;
        double rollmops = 2.82;
        double kluemkes = 1.77;

        double brutto = hering + rollmops + kluemkes;
        double umsatzsteuer = brutto / 119 * 19;
        double netto = (brutto - umsatzsteuer);

        System.out.println("Hering " + hering + "€");
        System.out.println("Rollmops " + rollmops + "€");
        System.out.println("Klümkes" + kluemkes + "€");

        System.out.println("*****Zusammengefasste Rechnung***** ");

        System.out.printf("Brutto: %2.2f Euro,\nUmsatzsteuer: %2.2f Euro,\nNetto; %2.2f Euro", brutto, umsatzsteuer, netto);


    }


}
