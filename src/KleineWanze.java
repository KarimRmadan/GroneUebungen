import java.util.Scanner;
public class KleineWanze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe das erste Wort ein; ");
        String wort1 = scanner.nextLine();

        System.out.print("Gebe das zweite Wort ein; ");
        String wort2 = scanner.nextLine();

        System.out.print("Gebe das dritte Wort ein; ");
        String wort3 = scanner.nextLine();

        System.out.printf("Auf der %s, auf der %s, Sitzt ne kleine %s ", wort1, wort2, wort3);
    }
}
