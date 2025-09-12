package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Shopping-Programm, dass zuerst einliest will, wie viele Artikel du kaufen willst.
 * Dann sollen die Artikel-Beträge (ganzzahlig) eingelesen werden und am Ende alle eingelesenen Beträge addiert werden.
 * Das Programm gibt am Ende den Gesamtbetrag aus:
 *
 * Benutzte dazu "ArrayList":
 * Google, was in Java ArrayList ist und wie ArrayList verwendet werden kann.
 *
 * Beispiel:
 * List<Integer> listOne = new ArrayList<>();  --> legt eine ArrayList an
 * listOne.add(5);              --> fügt den Wert 5 zur Liste hinzu
 * listOne.add(2);              --> fügt den Wert 2 zur Liste hinzu
 * System.out.println("Wert 2. Element = " + listOne.get(1))
 *
 * Bitte beachte, dass der Index mit 0 beginnt. Das bedeutet, dass das erste Element beim Index 0 steht.
 *
 * Beispiel für den Input und output des Programms:
 * ================================================
 *
 * Wieviele Artikel wollen Sie kaufen?
 * 4
 * Wieviel Euro kostet der 1. Artikel:
 * 2
 * Wieviel Euro kostet der 2. Artikel:
 * 1
 * Wieviel Euro kostet der 3. Artikel:
 * 4
 * Wieviel Euro kostet der 4. Artikel:
 * 6
 *
 * Die Summe beträgt 13 Euro.
 */
public class Aufgabe17 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Wieviele Artikel wollen Sie kaufen?");
        int anzahlArtikel = scanner.nextInt();

    }
}
