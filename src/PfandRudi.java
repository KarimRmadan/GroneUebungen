import java.util.Scanner;

public class PfandRudi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Anzahl Flaschen angeben; ");
        int flaschenAnzahl = input.nextInt();
        System.out.print("Anzahl Kästen angeben: ");
        double kastenPfand = input.nextDouble();

        double colaPreis = 0.50;
        double flaschenPfand = 0.20;
        double kaesten = 2.0;

        double pfand = (flaschenPfand * flaschenAnzahl) + (kastenPfand * kaesten);
        double preis = flaschenAnzahl * colaPreis + pfand;

        System.out.printf("Kosten insgesamt: %3.2f€\nPfand Betrag: %3.2f€", preis, pfand);

        input.close();


    }
}
