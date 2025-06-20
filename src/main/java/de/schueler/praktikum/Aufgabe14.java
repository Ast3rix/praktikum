package de.schueler.praktikum;

import java.util.Scanner;

/**
 * Eine weitere Mehrfachverzweigung kann man mit der switch-Anweisung umsetzen
 * (statt if - else if - else if - ... - else  --> Wie ein Aufgabe 7).
 * Im Prinzip entspricht eine switch-Anweisung einer mehrfach geschachtelten if-Anweisung,
 * hat aber den Vorteil, dass die switsch-Anweisung übersichtlicher ist.
 *
 * Google wie eine switch-Anweisung in Java funktioniert.
 * Implementiere ein Programm, eine einstellige Zahl einliest. Die Zahl soll dann als Text ausgegeben werden.
 * Nutze dafür eine Switch-Anweisung.
 * Wenn die Zahl höher als 9 ist, dann gib "Keine einstellige Zahl" aus.
 *
 * Beispiel für den Input und Output des Programms:
 * ================================================
 * Gebe eine einstellige Zahl ein:
 * 3
 * drei
 *
 * Gebe eine einstellige Zahl ein:
 * 15
 * Keine einstellige Zahl
 */
public class Aufgabe14 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gebe eine einstellige Zahl ein: ");
        int zahl = scanner.nextInt();


    }
}
