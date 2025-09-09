package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass die Anzahl der Buchtaben 'e' in einem eingebenen Wort zählt.
 * Nutze folgende Hilfsfunktionen:
 * String wort = "Hello";
 * text.charAt(0); // 'H' 0=erster Buchstabe
 * text.charAt(1); // 'e' 1=zweiter Buchstabe
 * text.charAt(2); // 'l' 2=dritter Buchstabe
 * ...
 * text.length(); // 5 letzter Buchstabe ist also text.length() -1 !!
 *
 * Verwende for-Schleifen und if-else....
 *
 *
 * Ausbauschritt, wenn der erste Teil bereits funktioniert:
 * Das Programm soll auch mit Großbuchstaben umgehen können.
 *
 * Beispiel:
 * Entenhausen -> 3xe  (1xE und 2xe)
 *
 */
public class Aufgabe13 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Bitte ein Wort eingeben: ");
        String wort = scanner.next();


    }
}
