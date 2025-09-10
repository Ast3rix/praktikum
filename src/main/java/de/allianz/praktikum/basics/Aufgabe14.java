package de.allianz.praktikum.basics;

import java.util.Locale;
import java.util.Scanner;

/**
 * Implementiere ein Programm, dass ein Wort einliest und dann das Wort anders herum zurück gibt.
 *
 * Beispiel:
 * Eingabe "hallo" -> Ausgabe "ollah"
 *
 * Falls das Wort ein Palindrom ist, dann gibt "Es handelt sich um ein Palindrome!" aus.
 * (Ein Palindrom ist ein Wort, dass vorwärts und rückwärts gleich ist. Beispiel: uhu, radar, rentner, ...)
 *
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
        String reversedwort = reverseString(wort);
        System.out.println("Original: " + wort);
        System.out.println("Umgekehrt: " + reversedwort);
    }
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    if('wort' == 'reversedwort') {
        System.out.println("Es handelt sich um ein Palindrom!");
    }
}
