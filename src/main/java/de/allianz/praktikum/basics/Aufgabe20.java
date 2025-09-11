package de.allianz.praktikum.basics;

import java.util.Scanner;

/**
 * Implementiere ein Programm, dass einen ganzzahligen Radius einließt.
 * Berechne dann die Fläche des Kreises (2 * r * 3.14)  und gebe diese in der Konsole aus.
 *
 * Lagere die Berechnung des Radius in eine Java-Methode "berechneFlaeche" aus.
 * Lagere die Ausgabe ebenfalls eine Methode "printRadius" aus.
 *
 * Nutze dann diese zwei Methoden in deinem Programm
 */
public class Aufgabe20 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Gib einen Radius an?");
        int radius = scanner.nextInt();
        double flaeche = berechenFlaeche(radius);
        printRadius(flaeche);
    }
    public static double berechenFlaeche (int radius) {
        return radius * radius * 3.14;
    }
    public static void printRadius (double flaeche) {
        System.out.println("Der Radius ist: " + flaeche);
    }

}
