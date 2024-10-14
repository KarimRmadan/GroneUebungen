public class Toilettenpapier {
    public static void main(String[] args) {
        double länge = 12 * 250 * 8;
        double breite = 9.8;
        double fläche = länge * breite;
        double gewicht = ((16.5 * 3) * fläche) / 1000000;



        System.out.println(("Das gesamt Gewicht beträgt ")+ gewicht + ("kg"));
    }
}
