import java.util.Scanner;

public class WaendeOeffnung {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Bitte die Länge angeben: ");
                double laenge = input.nextDouble();

                System.out.print("Bitte die Breite angeben: ");
                double breite= input.nextDouble();

                System.out.print("Bitte die Höhe angeben: ");
                double hoehe= input.nextDouble();

                double ergebnis = (2*breite*hoehe) + (2*laenge*hoehe);

                System.out.print("Bitte die Fensterbreite angeben: ");
                double fensterBreite = input.nextDouble();

                System.out.print("Bitte die Fensterhöhe angeben: ");
                double fensterHoehe = input.nextDouble();

                System.out.print("Bitte die Türbreite angeben: ");
                double tuerBreite = input.nextDouble();

                System.out.print("Bitte die Türhöhe angeben: ");
                double tuerHoehe = input.nextDouble();

                double ergebnisFenster = fensterBreite * fensterHoehe;
                double ergebnisTuer = tuerHoehe * tuerBreite;

                ergebnis = ergebnis - ergebnisFenster - ergebnisTuer;



                System.out.println("Das Volumen beträgt ohne Türen und Fenster: " + ergebnis + "qm");

                input.close();
    }
}
