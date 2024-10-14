import java.util.Scanner;
public class flächenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte die Länge angeben: ");
        double laenge = input.nextDouble();

        System.out.print("Bitte die Breite angeben: ");
        double breite= input.nextDouble();

        System.out.println("Der Flächeninhalt beträgt: " + breite*laenge);

        input.close();



    }
}
