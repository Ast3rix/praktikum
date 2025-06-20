package de.schueler.praktikum;

/**
 * Nutze if-else (google und lese dich ein, wie man if-else nutzt) um
 * folgendes zu zu implementieren:
 * Wenn die Zufallszahl kleiner als 30 ist, soll "Zufallszahl < 30" ausgegeben werden.
 * Wenn die Zufallszahl zwischen 30 und 50 ist, soll "30 <= Zufallszahl < 50" ausgegeben werden.
 * Wenn die Zufallszahl zwischen 50 und 75 ist, soll "50 <= Zufallszahl < 75" ausgegeben werden.
 * Wenn die Zufallszahl größer oder gleich 75 ist, soll "Sonstige Zahl" ausgegeben werden.
 */

import java.util.Random;

public class Aufgabe08 {

    public static void main(String[] args) {
        var random = new Random();
        int zufallsZahl = random.nextInt(100);
        System.out.println("Zufallszahl = " + zufallsZahl);


    }
}
