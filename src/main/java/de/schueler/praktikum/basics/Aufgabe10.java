package de.schueler.praktikum;

import java.util.Random;
import java.util.Scanner;

/**
 * Implementiere ein kleines Spiel:
 * Der Spieler soll eine Zahl zwischen 1 und 20 in drei Versuchen erraten.
 * Nach jedem Versuch gibts du ihm einen Tipp, ob die Zahl kleiner oder höher ist.
 * Wenn er die Zahl erraten sollte, dann ist das Spiel sofort beendet und du gibst "Glückwunsch du hast die Zahl erraten."
 *
 * Hilfestellung:
 * Der Rohbau des Spiels ist bereits umgesetzt. Teste das Spiel bereits vor der Umsetzung und versuche zu verstehen was es bereits kann.
 * "scanner.next()" wartet auf eine Eingabe in der Konsole (An der Stelle an der Text ausgegeben wird, kann auch etwas eingeben.)
 */
public class Aufgabe10 {

    public static void main(String[] args) {
        var random = new Random();
        var zufallsZahl = random.nextInt(20);
        var scanner = new Scanner(System.in);

        System.out.println("Gib die erste Zahl ein: ");
        int ersteZahl =Integer.parseInt(scanner.next());



        System.out.println("Gib die zweite Zahl ein: ");
        int zweiteZahl =Integer.parseInt(scanner.next());



        System.out.println("Gib die ditte Zahl ein: ");
        int dritteZahl =Integer.parseInt(scanner.next());


        System.out.println("======== ENDE ============");
        System.out.println("Die Zufallszahl war: " + zufallsZahl);

    }
}
