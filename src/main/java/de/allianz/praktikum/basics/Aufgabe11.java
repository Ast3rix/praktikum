package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, bei dem eine Zahl eingelesen wird.
 * Es sollen danach so viele # ausgegeben werden, wie der Wert der Zahl ist.
 * Beispiel:
 * Eingabe ist 3 -> Ausgabe: ###
 * Eingabe ist 5 -> Ausgabe ist #####
 * Eingabe ist 10 -> Ausgabe ist ##########
 * <p>
 * Nutze dafür eine for-Schleife. Lies dich ein, wie man eine for-Schleife implementiert. (Goolge)
 */
public class Aufgabe11 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Wie viele # soll ich anzeigen?");
        int anzahl = Integer.valueOf(scanner.next());


    }
}
