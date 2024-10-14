import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte Geschlecht angeben (1=Männlich,2=Weiblich): ");
        double geschlecht = input.nextDouble();
        System.out.print("Bitte Gewicht angeben: ");
        double gewicht = input.nextDouble();
        System.out.print("Bitte Größe angeben : ");
        double groesse = input.nextDouble();


        input.close();
    }
}
