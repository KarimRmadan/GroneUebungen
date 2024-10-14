import java.util.Scanner;

public class Bodenfläche {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte die Länge angeben: ");
        double laenge = input.nextDouble();

        System.out.print("Bitte die Breite angeben: ");
        double breite = input.nextDouble();

        System.out.print("Bitte die Höhe angeben: ");
        double hoehe = input.nextDouble();

        double ergebnis = (2 * breite * hoehe) + (2 * laenge * hoehe);


        System.out.println("Das Volumen beträgt: " + ergebnis);

        input.close();
    }
}
