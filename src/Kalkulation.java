import java.io.PrintStream;
import java.util.Scanner;

public class Kalkulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte Produkt eingeben: ");
        String produkt = input.next();
        System.out.print("Bitte Einkaufspreis eingeben: ");
        double eK = input.nextDouble();
        System.out.print("Bitte Lieferantenskonto eingeben(in %): ");
        double lSkonto = input.nextDouble();
        System.out.print("Bitte Frachtkosten eingeben: ");
        double fKosten = input.nextDouble();
        System.out.print("Bitte Handlungskosten eingeben : ");
        double hK = input.nextDouble();
        System.out.print("Bitte Gewinn eingeben (in %): ");
        double gewinnInProzent = input.nextDouble();
        System.out.print("Bitte MWST eingeben(in %): ");
        double mwst = input.nextDouble();

        double lieferantenSkonto = eK / 100 * lSkonto;
        double bezugsKosten = eK - lieferantenSkonto + fKosten;
        double selbstKosten = bezugsKosten + hK;
        double gewinn = selbstKosten / 100 * gewinnInProzent;
        double netto = selbstKosten + gewinn;
        double mehrWertSteuer = netto / 100 * mwst;
        double brutto = netto + mehrWertSteuer;

        System.out.println(produkt);
        System.out.printf("Einkaufspreis; %8.2f€,\nLieferantenskonto: %2.2f %%,\nFrachtkosten:\t %2.2f €,\nBezugskosten: %8.2f €,\nSelbstkosten: %8.2f €,\nGewinn: %8.2f €,\nNetto:\t %8.2f €,\nMehrwertsteuer: %8.2f %%,\nBrutto Verkaufspreis: %8.2f €", eK, lieferantenSkonto, fKosten, bezugsKosten, selbstKosten, gewinn, netto, mehrWertSteuer, brutto);

        input.close();


    }
}
