
import java.util.Scanner;

public class BMIrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte Geschlecht angeben (m/w): ");
        String geschlecht = input.next();
        System.out.print("Bitte Gewicht angeben: ");
        double gewicht = input.nextDouble();
        System.out.print("Bitte Größe angeben in cm: ");
        double groesse = input.nextDouble();

        double bmi = (gewicht * 10000) / (groesse * groesse);

        System.out.printf("Ihr BMI beträgt: %2.0f\n", bmi);

        if (geschlecht.equals("m")) {
            if (bmi < 20) {
                System.out.println("Sie haben Untergewicht!");
            }

            if (bmi >= 20 && bmi <= 25) {
                System.out.println("Sie haben Normalgewicht!");
            }

            if (bmi >= 26 && bmi <= 30) {
                System.out.println("Sie haben Übergewicht!");
            }
            if (bmi > 30) {
                System.out.println("Sie sind ungesund Fett!");
            }

            if (geschlecht.equals("w")) {
                if (bmi < 19) {
                    System.out.println("Sie haben Untergewicht!");
                }

                if (bmi >= 19 && bmi <= 24) {
                    System.out.println("Sie haben Normalgewicht!");
                }

                if (bmi >= 25 && bmi <= 30) {
                    System.out.println("Sie haben Übergewicht!");
                }
                if (bmi > 30) {
                    System.out.println("Sie sind ungesund Fett!");
                }


            }
        }

    }
}