package de.schueler.praktikum;

import java.util.Random;
import java.util.Scanner;
/*
Schreibe folgendes Spiel:

Der Spieler soll eine Zahl zwischen 1 und 20 in drei Versuchen erraten.
Nach jedem Versuch gibts du ihm einen Tipp, ob die Zahl kleiner oder höher ist.
Wenn er die Zahl erraten sollte, dann ist das Spiel sofort beendet und du gibst "Glückwunsch du hast die Zahl erraten."

Hilfestellung:
Der Rohbau des Spiels ist bereits umgesetzt. Teste das Spiel bereits vor der Umsetzung und versuche zu verstehen was es bereits kann.
"scanner.next()" wartet auf eine Eingabe in der Konsole (wo der Text ausgegeben wird, kann man auch etwas eingeben)1
 */
public class Aufgabe8 {

    public static void main(String[] args) {
        var random = new Random();
        var zufallsZahl = random.nextInt(20);
        var scanner = new Scanner(System.in);

        System.out.println("Gib die erste Zahl ein: ");
        int ersteZahl =Integer.valueOf(scanner.next());



        System.out.println("Gib die zweite Zahl ein: ");
        int zweiteZahl =Integer.valueOf(scanner.next());



        System.out.println("Gib die ditte Zahl ein: ");
        int dritteZahl =Integer.valueOf(scanner.next());


        System.out.println("======== ENDE ============");
        System.out.println("Die Zufallszahl war: " + zufallsZahl);

    }
}
