package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Shopping-Programm, dass zuerst einliest will, wie viele Artikel du kaufen willst.
 * Dann sollen die Artikel-Beträge (ganzzahlig) eingelesen werden und am Ende alle eingelesenen Beträge addiert werden.
 * Das Programm gibt am Ende den Gesamtbetrag aus:
 * <p>
 * Benutzte dazu "arrays":
 * Google, was in Java Arrays sind und wie Arrays verwendet werden können.
 * <p>
 * Beispiel:
 * int[] arrayOne = new Int[3];  --> legt ein Array mit der Größe 3 an
 * arrayOne[0] = 5;              --> schreibt in das erste Feld den Wert 5
 * arrayOne[1] = 2;              --> schreibt in das zweite Feld den Wert 2
 * arrayOne[2] = arrayOne[0] * 3;   -> schreibt in das dritte Feld das Produkt aus dem ersten Feld und 3
 * System.out.println("Wert 2. Feld = " + arrayOne[1])
 * <p>
 * Bitte beachte, dass der Index mit 0 beginnt. Das bedeutet, dass das erste werte Werte beim Feld 0 steht.
 * <p>
 * Beispiel für den Input und output des Programms:
 * ================================================
 * <p>
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
 * <p>
 * Die Summe beträgt 13 Euro.
 */
public class Aufgabe17 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Wieviele Artikel wollen Sie kaufen?");
        int anzahlArtikel = scanner.nextInt();
        int[] arrayOne = new int[anzahlArtikel];
        for (int i = 0; i < anzahlArtikel; i++) {
            System.out.println("Wie viel Euro kostet der " + (i+1) + ". Artikel?" );
            int aktuelerpreis = scanner.nextInt();
            arrayOne[i] = aktuelerpreis;
        }
        int gesamtpreis = 0;
        for (int i = 0; i < anzahlArtikel; i++) {
            gesamtpreis = gesamtpreis + arrayOne[i];
        }
        System.out.println("gesamtpreis " + gesamtpreis);
    }
}

