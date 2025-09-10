package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass die Anzahl der Buchtaben 'e' in einem eingebenen Wort zählt.
 * Nutze folgende Hilfsfunktionen:
 * String wort = "Hello";
 * wort.charAt(0); // 'H' 0=erster Buchstabe
 * wort.charAt(1); // 'e' 1=zweiter Buchstabe
 * wort.charAt(2); // 'l' 2=dritter Buchstabe
 * ...
 * text.length(); // 5 letzter Buchstabe ist also text.length() -1 !!
 * <p>
 * Verwende for-Schleifen und if-else....
 * <p>
 * <p>
 * Ausbauschritt, wenn der erste Teil bereits funktioniert:
 * Das Programm soll auch mit Großbuchstaben umgehen können.
 * <p>
 * Beispiel:
 * Entenhausen -> 3xe  (1xE und 2xe)
 *
 */
public class Aufgabe13 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Bitte ein Wort eingeben: ");
        String wort = scanner.next();
        int countE = 0;
        for (int i = 0; i < wort.length(); i++) {
            char buchstabeAtIndex = wort.charAt(i);
            if (buchstabeAtIndex == 'e' || buchstabeAtIndex == 'E') {
                countE++;
            }
        }
        System.out.println("Anzahl der 'e' = "  +  countE);

    }
}
