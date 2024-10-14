import java.util.Scanner;

public class Farbe {
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

                double farbe = ergebnis * 0.15;



                System.out.println("Die Fläche beträgt ohne Türen und Fenster: " + ergebnis + "qm");

                System.out.println("Die benötigte Farbmenge beträgt: " + farbe + "l");

                input.close();
    }
}
