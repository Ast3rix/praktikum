package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass ein Wort einliest und dann das Wort anders herum zurück gibt.
 * <p>
 * Beispiel:
 * Eingabe "hallo" -> Ausgabe "ollah"
 * <p>
 * Falls das Wort ein Palindrom ist, dann gibt "Es handelt sich um ein Palindrome!" aus.
 * (Ein Palindrom ist ein Wort, dass vorwärts und rückwärts gleich ist. Beispiel: uhu, radar, rentner, ...)
 * <p>
 * Ausbauschritt, wenn der erste Teil bereits funktioniert:
 * Das Programm soll bei der Palidrom-Erkennung die Großbuchstaben ignorieren können.
 * Beispiel:
 * Eingabe "Rentner" -> Ausgabe "Es handelt sich um ein Palindrome!"
 *
 */
public class Aufgabe14 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Bitte ein Wort eingeben: ");
        String wort = scanner.next();
        String reversedwort = "";
        for (int i = wort.length() - 1; i >= 0; i--) {
            System.out.println("Aktueller Buchstabe: "  +  wort.charAt(i));
            reversedwort += wort.charAt(i);
            System.out.println("Aktuelle ReveserWort: "  + reversedwort);
        }
        System.out.println("Original: " + wort);
        System.out.println("Umgekehrt: " + reversedwort);

        if(wort.equalsIgnoreCase(reversedwort)) {
            System.out.println("Es handelt sich um ein Palindrom!");
        }

    }

}
