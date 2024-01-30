import java.util.Scanner;
import java.util.Random;

public class zahlerraten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int zufallszahl = random.nextInt(100) + 1; // Zufallszahl zwischen 1 und 100
        int versuche = 0;
        int raten;

        System.out.println("Willkommen zum Zahl Erraten Spiel!");
        System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 ausgedacht. Können Sie sie erraten?");

        do {
            System.out.print("Geben Sie Ihre Vermutung ein: ");
            raten = scanner.nextInt();
            versuche++;

            if (raten > zufallszahl) {
                System.out.println("Zu hoch! Versuchen Sie es noch einmal.");
            } else if (raten < zufallszahl) {
                System.out.println("Zu niedrig! Versuchen Sie es noch einmal.");
            }
        } while (raten != zufallszahl);

        System.out.println("Glückwunsch! Sie haben die Zahl mit " + versuche + " Versuchen erraten.");

        scanner.close();
    }
}
