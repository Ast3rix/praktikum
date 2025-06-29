package de.schueler.praktikum;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass einen ganzzahligen Radius einließt.
 * Berechne dann die Fläche des Kreises (2 * r * 3.14)  und gebe diese in der Konsole aus.
 *
 * Lagere die Berechnung des Radius in eine Java-Methode "berechneRadius" aus.
 * Lagere die Ausgabe ebenfalls eine Methode "printRadius" aus.
 *
 * Nutze dann diese zwei Methoden in deinem Programm
 */
public class Aufgabe20 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gib einen Radius an?");
        int radius = scanner.nextInt();

    }
}
